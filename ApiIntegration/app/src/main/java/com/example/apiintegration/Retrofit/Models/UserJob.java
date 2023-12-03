package com.example.apiintegration.Retrofit.Models;


//Request class for CREATE (POST)
public class UserJob {
    String name;
    String job;
    String id;
    String createdAt;

    public String getName() {
        return name;
    }

    //request parameters are name and job
    public UserJob(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
