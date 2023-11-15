package com.zenteno.login1.Entity;

import java.io.Serializable;
import jakarta.persistence.*;
//import java.util.List;


@Entity
@Table(name = "job")
public class Job implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "description", length = 50, nullable = false)
    private String description;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
