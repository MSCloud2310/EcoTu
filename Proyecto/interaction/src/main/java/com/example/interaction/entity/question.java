package com.example.interaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class question {

    @Id
    @Column(name="id_question")
    private  Integer id_question;
    @Column(name="question")
    private String question;
    @Column(name="answer")
    private String answer;
    @Column(name="id_service")
    private Integer id_service;
    @Column(name="id_client")
    private  Integer id_client;
    @Column(name="id_supplier")
    private  Integer id_supplier;

    public question() {
    }

    public question(Integer id_question, String question, String answer, Integer id_service, Integer id_client, Integer id_supplier) {
        this.id_question = id_question;
        this.question = question;
        this.answer = answer;
        this.id_service = id_service;
        this.id_client = id_client;
        this.id_supplier = id_supplier;
    }

    public Integer getId_question() {
        return id_question;
    }

    public void setId_question(Integer id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public Integer getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Integer id_supplier) {
        this.id_supplier = id_supplier;
    }
}
