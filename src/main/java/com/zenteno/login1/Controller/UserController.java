package com.zenteno.login1.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.zenteno.login1.Entity.User;
import com.zenteno.login1.Service.UserService;


@RestController
@CrossOrigin
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User _user) {
        try {
            return userService.createUser(_user);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found", e);
        }
    }

    @GetMapping("/user")
    public List<User> findAll() {
        try {
            return userService.getAllUser();        
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found", e);
        }
    }    

    @GetMapping(path = "/cadena")
    public String cadena() {
        return "cadena";
    }

}