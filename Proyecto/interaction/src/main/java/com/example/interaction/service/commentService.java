package com.example.interaction.service;


import com.example.interaction.entity.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class commentService {
    @Autowired
    com.example.interaction.repository.commentsRepository commentsRepository;

    //Get all comment that a service has
    public List<comment> getAllCommentsProduct(Integer idProduct){
        List<comment> allComment=new ArrayList<>();
        for (comment comment: commentsRepository.findAll()){
            if(comment.getId_service()==idProduct){
                allComment.add(comment);
            }
        }
        return allComment;
    }
    public  void save (comment comment) {commentsRepository.save(comment);}
    public  void delete (Integer id){
        commentsRepository.deleteById(id);
    }
}
