package com.example.service.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class serviceFood {

    private Integer id_supplier;
    private String duration;
    private Double price;
    private String photo_url;
    private String name;
    private String category;
    private Integer availability;


    private Integer id_food;

    private String place_type;

    private String diet_type;

    private String food_type;


    private Integer id_service;

    public serviceFood(Integer id_supplier, String duration, Double price, String photo_url, String name, String category, Integer availability, Integer id_food, String place_type, String diet_type, String food_type, Integer id_service) {
        this.id_supplier = id_supplier;
        this.duration = duration;
        this.price = price;
        this.photo_url = photo_url;
        this.name = name;
        this.category = category;
        this.availability = availability;
        this.id_food = id_food;
        this.place_type = place_type;
        this.diet_type = diet_type;
        this.food_type = food_type;
        this.id_service = id_service;
    }

    @Override
    public String toString() {
        return "serviceFood{" +
                "id_supplier=" + id_supplier +
                ", duration='" + duration + '\'' +
                ", price=" + price +
                ", photo_url='" + photo_url + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", availability=" + availability +
                ", id_food=" + id_food +
                ", place_type='" + place_type + '\'' +
                ", diet_type='" + diet_type + '\'' +
                ", food_type='" + food_type + '\'' +
                ", id_service=" + id_service +
                '}';
    }
}