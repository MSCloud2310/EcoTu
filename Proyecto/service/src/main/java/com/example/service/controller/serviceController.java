package com.example.service.controller;

import com.example.service.entity.*;
import com.example.service.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")
//http://localhost:8083/service/
public class serviceController {

    @Autowired
    private com.example.service.service.serviceService serviceService;

    @Autowired
    private com.example.service.service.transportService transportService;

    @Autowired
    private com.example.service.service.foodService foodService;

    @Autowired
    private com.example.service.service.entreService entreService;

    @Autowired
    private com.example.service.service.logService logService;

    @GetMapping("/services")
    public ResponseEntity<List<service>> getAllService() {
        return new ResponseEntity<>(serviceService.getALlServices(), HttpStatus.OK);
    }

    @PostMapping("/service")
    public ResponseEntity<String> saveService(@RequestBody service newService) {
        serviceService.saveService(newService);
        return new ResponseEntity<>("Se ha guardado con exito", HttpStatus.OK);
    }

    @PutMapping("/service")
    public ResponseEntity<String> updateService(@RequestBody service updateService) {
        int i = serviceService.updateService(updateService);
        if (i == 1) {
            return new ResponseEntity<>("Se ha modificado con exito", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Intente de nuevo", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/service/{id}")
    public ResponseEntity<String> deleteService(@PathVariable Integer id) {
        serviceService.deleteService(id);
        return new ResponseEntity<>("Se ha eliminado con exito", HttpStatus.OK);
    }


    @GetMapping("/service/{id}")
    public ResponseEntity<String> getOneDetail(@PathVariable Integer id) {

        service serviceFound = serviceService.getJustOne(id);
        if (serviceFound.getCategory().equals("Food")) {
            serviceFood serviceFood = createServiceFood(serviceFound, id);
            return new ResponseEntity<>(serviceFood.toString(), HttpStatus.OK);
        } else if (serviceFound.getCategory().equals("Transport")) {
            serviceTransport serviceTransport = createServiceTransport(serviceFound, id);
            return new ResponseEntity<>(serviceTransport.toString(), HttpStatus.OK);
        } else if (serviceFound.getCategory().equals("Entertainment")) {
            serviceEnter serviceEnter = createServiceEnter(serviceFound, id);
            return new ResponseEntity<>(serviceEnter.toString(), HttpStatus.OK);
        } else if (serviceFound.getCategory().equals("Logdment")) {
            serviceLogdment serviceLogdment = createServiceLog(serviceFound, id);
            return new ResponseEntity<>(serviceLogdment.toString(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }


     @GetMapping("/category/{category}")
    public ResponseEntity<List<String>> getAllCategory(@PathVariable  String category) {
        List<service> serviceCategory = serviceService.getAllCategory(category);
        List<String> returnServices = new ArrayList<>();

        if (category.equals("Food")) {
            for (service serviceFound : serviceCategory) {

                serviceFood serviceFood = createServiceFood(serviceFound, serviceFound.getId_service());
                returnServices.add(serviceFood.toString());
            }
            return new ResponseEntity<>(returnServices, HttpStatus.OK);
        } else if (category.equals("Transport")) {
            for (service serviceFound : serviceCategory) {

                serviceTransport serviceTransport = createServiceTransport(serviceFound, serviceFound.getId_service());
                returnServices.add(serviceTransport.toString());
            }
            return new ResponseEntity<>(returnServices, HttpStatus.OK);

        } else if (category.equals("Entertainment")) {

            for (service serviceFound : serviceCategory) {

                serviceEnter serviceEnter = createServiceEnter(serviceFound, serviceFound.getId_service());
                returnServices.add(serviceEnter.toString());
            }
            return new ResponseEntity<>(returnServices, HttpStatus.OK);
        } else if (category.equals("Logdment")) {
            for (service serviceFound : serviceCategory) {

                serviceLogdment serviceLogdment = createServiceLog(serviceFound, serviceFound.getId_service());
                returnServices.add(serviceLogdment.toString());
            }
            return new ResponseEntity<>(returnServices, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);


    }


    /*@GetMapping("/gallery/{category}")
    public ResponseEntity<List<String>> getImg(@PathVariable String category) {


    }*/


    public serviceFood createServiceFood(service serviceFound, Integer id) {
        food foodAux = foodService.getAllService(id);
        serviceFood serviceFood = new serviceFood(serviceFound.getId_supplier(),
                serviceFound.getDuration(), serviceFound.getPrice(), serviceFound.getPhoto_url(), serviceFound.getName(), serviceFound.getCategory(),
                serviceFound.getAvailability(), foodAux.getId_food(), foodAux.getPlace_type(), foodAux.getDiet_type(), foodAux.getFood_type(), foodAux.getId_service());
        return serviceFood;
    }

    public serviceEnter createServiceEnter(service serviceFound, Integer id) {
        entre entreAux = entreService.getAllService(id);
        serviceEnter serviceEnter = new serviceEnter(serviceFound.getId_supplier(),
                serviceFound.getDuration(), serviceFound.getPrice(), serviceFound.getPhoto_url(), serviceFound.getName(), serviceFound.getCategory(),
                serviceFound.getAvailability(), entreAux.getId_enter(), entreAux.getEnter_type(), entreAux.getTime_arrival(), entreAux.getTime_departure(),
                entreAux.getRestriction(), entreAux.getId_service());
        return serviceEnter;
    }

    public serviceLogdment createServiceLog(service serviceFound, Integer id) {
        log logAux = logService.getAllService(id);
        serviceLogdment serviceLogdment = new serviceLogdment(logAux.getId_logdment(), logAux.getLogdment_type(), logAux.getRoom_type(), logAux.getId_service(), serviceFound.getId_supplier(),
                serviceFound.getDuration(), serviceFound.getPrice(), serviceFound.getPhoto_url(), serviceFound.getName(), serviceFound.getCategory(),
                serviceFound.getAvailability());
        return serviceLogdment;
    }

    public serviceTransport createServiceTransport(service serviceFound, Integer id) {
        transport transportAux = transportService.getAllService(id);
        serviceTransport serviceTransport = new serviceTransport(transportAux.getId_transport(), transportAux.getVehicule_type(), transportAux.getPath_name(),
                transportAux.getTime_arrival(), transportAux.getTime_departure(), transportAux.getId_service(), serviceFound.getId_supplier(),
                serviceFound.getDuration(), serviceFound.getPrice(), serviceFound.getPhoto_url(), serviceFound.getName(), serviceFound.getCategory(),
                serviceFound.getAvailability());
        return serviceTransport;

    }

}
