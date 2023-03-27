package com.diomedazo.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.diomedazo.entities.GetAllServicesResponse;
import com.diomedazo.repository.ServiceRepository;

@Endpoint
public class ServiceEndpoint {
    private static final String NAMESPACE_URI = "http://www.diomedazo.com/entities";
    private ServiceRepository serviceRepository;


    public ServiceEndpoint(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllServicesRequest")
    @ResponsePayload
    public GetAllServicesResponse getAllServices() {
        GetAllServicesResponse response= new GetAllServicesResponse();
        response.getService().addAll(serviceRepository.findAll());
        return response;
    }
}
