package com.example.interaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class comment {
    @Id
    @Column(name="id_comment")
    private  Integer id_comment;

    @Column(name="message")
    private String message;

    @Column(name="id_service")
    private Integer id_service;

    @Column(name="id_client")
    private  Integer id_client;

    public comment() {
    }

    public comment(Integer id_comment, String message, Integer id_service, Integer id_client) {
        this.id_comment = id_comment;
        this.message = message;
        this.id_service = id_service;
        this.id_client = id_client;
    }

    public Integer getId_comment() {
        return id_comment;
    }

    public void setId_comment(Integer id_comment) {
        this.id_comment = id_comment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
