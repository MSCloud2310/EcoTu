package com.example.interaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class rating {
    @Id
    @Column(name="id_rating")
    private  Integer id_rating;

    @Column(name="number")
    private Integer number;

    @Column(name="id_service")
    private Integer id_service;

    @Column(name="id_client")
    private  Integer id_client;

    public rating() {
    }

    public rating(Integer id_rating, Integer number, Integer id_service, Integer id_client) {
        this.id_rating = id_rating;
        this.number = number;
        this.id_service = id_service;
        this.id_client = id_client;
    }

    public Integer getId_rating() {
        return id_rating;
    }

    public void setId_rating(Integer id_rating) {
        this.id_rating = id_rating;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Integer getId_service() {
        return id_service;
    }

    public void setId_service(Integer id_service) {
        this.id_service = id_service;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }
}
