package com.example.interaction.service;

import com.example.interaction.entity.question;
import com.example.interaction.repository.questionRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class questionService {

    @Autowired
    com.example.interaction.repository.questionRepository questionRepository;

    //Get all question that a service has
    public List<question>getAllQuestionProduct(Integer idProduct){
        List<question> allQuestions=new ArrayList<>();
        for (question qst: questionRepository.findAll()){
            if(qst.getId_service()==idProduct){
                allQuestions.add(qst);
            }
        }
        return allQuestions;
    }

    //Save question
    public void save(question newQst){
        questionRepository.save(newQst);
    }
    //Delete question
    public  void delete (Integer id){
        questionRepository.deleteById(id);
    }

}
