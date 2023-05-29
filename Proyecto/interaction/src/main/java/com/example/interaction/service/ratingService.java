package com.example.interaction.service;

import com.example.interaction.entity.question;
import com.example.interaction.entity.rating;
import com.example.interaction.repository.ratingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ratingService {
    
    @Autowired
    com.example.interaction.repository.ratingRepository ratingRepository;
    
    //Get all rating that a service has
    public List<rating> getAllRatingProduct(Integer idProduct){
        List<rating> allRating=new ArrayList<>();
        for (rating rating: ratingRepository.findAll()){
            if(rating.getId_service()==idProduct){
                allRating.add(rating);
            }
        }
        return allRating;
    }
    public  void save (rating rating) {ratingRepository.save(rating);}
    public  void delete (Integer id){
        ratingRepository.deleteById(id);
    }
}
