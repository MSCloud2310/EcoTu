package com.example.interaction.controller;

import com.example.interaction.entity.question;
import com.example.interaction.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interaction")
//http://localhost:8082/interaction/
public class questionController {

    @Autowired
    private com.example.interaction.service.questionService questionService;

    //Get questions for product
    @GetMapping("/question/{id}")
    public ResponseEntity<List<question>> getAll(@PathVariable Integer id){
        return  new ResponseEntity<>(questionService.getAllQuestionProduct(id), HttpStatus.OK);
    }

    //Save
    @PostMapping("/question")
    public ResponseEntity<String> newQuestion(@RequestBody question newQuestion){
        questionService.save(newQuestion);
        return  new ResponseEntity<>("Se ha agregado con exito", HttpStatus.OK);

    }

    //Update
    @PutMapping("/question")
    public ResponseEntity<String> updateQuestion(@RequestBody question updateQuestion){
        questionService.save(updateQuestion);
        return  new ResponseEntity<>("Se ha modificado con exito", HttpStatus.OK);

    }


    //Delete
    @DeleteMapping ("/question/{id}")
    public ResponseEntity<String> deleteQuestion (@PathVariable Integer id){
        questionService.delete(id);
        return  new ResponseEntity<>("Se ha eliminado con exito", HttpStatus.OK);
    }

}
