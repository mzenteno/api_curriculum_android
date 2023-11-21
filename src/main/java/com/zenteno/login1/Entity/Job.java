package com.zenteno.login1.Entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;


@Entity
@Table(name = "job")
public class Job implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @OneToMany( mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<Person> persons;

    public Job() { }

    public Job(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    // public List<Person> getPersons() {
    //     return this.person;
    // }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public void setPersons(List<Person> person) {
    //     this.person = person;
    // }

}
