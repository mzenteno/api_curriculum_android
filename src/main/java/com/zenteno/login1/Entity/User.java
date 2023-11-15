package com.zenteno.login1.Entity;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "full_name")
    private String full_name;
        
    @Column(name = "user_name")
    private String user_name;

    @Column(name = "password")
    private String password;

    public User() { }

    public User(int id, String full_name, String user_name, String password) {
        this.id = id;
        this.full_name = full_name;
        this.user_name = user_name;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int value) {
        this.id = value;
    }

    public String getFullName() {
        return this.full_name;
    }
    public void setFullName(String value) {
        this.full_name = value;
    }

    public String getUserName() {
        return this.user_name;
    }
    public void setUserName(String value) {
        this.user_name = value;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String value) {
        this.password = value;
    }

    // @Override
    // public String toString() {
    //     return "User[id=" + this.id +",full_name=" + this.full_name + ",user_name=" + this.user_name + ",password=" + this.password + "]";
    // }

}