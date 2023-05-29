package com.example.interaction.controller;

import com.example.interaction.entity.comment;
import com.example.interaction.entity.question;
import com.example.interaction.entity.rating;
import com.example.interaction.service.commentService;
import com.example.interaction.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interaction")
//http://localhost:8082/interaction/
public class interactionController {

    @Autowired
    private com.example.interaction.service.questionService questionService;

    @Autowired
    private com.example.interaction.service.commentService commentService;

    @Autowired
    private com.example.interaction.service.ratingService ratingService;

    //Get questions for product
    @GetMapping("/question/{id}")
    public ResponseEntity<List<question>> getAllQuestions(@PathVariable Integer id){
        return  new ResponseEntity<>(questionService.getAllQuestionProduct(id), HttpStatus.OK);
    }

    //Get comments for product
    @GetMapping("/comment/{id}")
    public ResponseEntity<List<comment>> getAllComments(@PathVariable Integer id){
        return  new ResponseEntity<>(commentService.getAllCommentsProduct(id), HttpStatus.OK);
    }

    //Get comments for product
    @GetMapping("/rating/{id}")
    public ResponseEntity<List<rating>> getAllRating(@PathVariable Integer id){
        return  new ResponseEntity<>(ratingService.getAllRatingProduct(id), HttpStatus.OK);
    }

    //Save
    @PostMapping("/question")
    public ResponseEntity<String> newQuestion(@RequestBody question newQuestion){
        questionService.save(newQuestion);
        return  new ResponseEntity<>("Se ha agregado con exito", HttpStatus.OK);

    }

    //Save
    @PostMapping("/comment")
    public ResponseEntity<String> newComment(@RequestBody comment newComment){
        commentService.save(newComment);
        return  new ResponseEntity<>("Se ha agregado con exito", HttpStatus.OK);

    }

    //Save
    @PostMapping("/rating")
    public ResponseEntity<String> newRating (@RequestBody rating newRating){
        if (newRating.getNumber()>6||1>newRating.getNumber()){
            return  new ResponseEntity<>("La escala es de 1 a 5", HttpStatus.BAD_REQUEST);
        }
        ratingService.save(newRating);
        return  new ResponseEntity<>("Se ha agregado con exito", HttpStatus.OK);
    }


    //Update
    @PutMapping("/question")
    public ResponseEntity<String> updateQuestion(@RequestBody question updateQuestion){
        questionService.save(updateQuestion);
        return  new ResponseEntity<>("Se ha modificado con exito", HttpStatus.OK);

    }

    //update
    @PutMapping("/comment")
    public ResponseEntity<String> updateComment(@RequestBody comment newComment){
        commentService.save(newComment);
        return  new ResponseEntity<>("Se ha modificado con exito", HttpStatus.OK);

    }
    //Update
    @PutMapping("/rating")
    public ResponseEntity<String> updateRating (@RequestBody rating newRating){
        if (newRating.getNumber()>6 || newRating.getNumber()<1){
            return  new ResponseEntity<>("La escala es de 1 a 5", HttpStatus.BAD_REQUEST);
        }
        ratingService.save(newRating);
        return  new ResponseEntity<>("Se ha modificado con exito", HttpStatus.OK);
    }


    //Delete
    @DeleteMapping ("/question/{id}")
    public ResponseEntity<String> deleteQuestion (@PathVariable Integer id){
        questionService.delete(id);
        return  new ResponseEntity<>("Se ha eliminado con exito", HttpStatus.OK);
    }




}
