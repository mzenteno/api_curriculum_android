package com.zenteno.login1.Entity;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "full_name", length = 60, nullable = false )
    private String full_name;

    @Column(name = "ubication", length = 50, nullable = false )
    private String ubication;

    @Column(name = "description", length = 500, nullable = false )
    private String description;

    @Column(name = "photo", length = 50, nullable = false )
    private String photo;

    @Column(name = "state", length = 1, nullable = false )
    private String state;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_job", nullable = false)
    private Job job;

    public Person() { }

    public Person(int id, String full_name, String ubication, String description, String photo, String state, Job _job) {
        this.id = id;
        this.full_name = full_name;
        this.ubication = ubication;
        this.description = description;
        this.photo = photo;
        this.state = state;
        this.job = _job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getId() {
        return this.id;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public String getUbication() {
        return this.ubication;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPhoto() {
        return this.photo;
    }

    public String getState() {
        return this.state;
    }

    public Job getJob() {
        return job;
    }

}