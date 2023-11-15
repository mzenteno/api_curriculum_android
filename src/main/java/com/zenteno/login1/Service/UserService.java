package com.zenteno.login1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zenteno.login1.Entity.User;
import com.zenteno.login1.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //CREATE
    public User createUser(User _user) {
        return userRepository.save(_user);
    }

    //UPDATE
    public User updateUser(Integer _id, User _user) {
        User oUser = userRepository.getReferenceById(_id);
        oUser.setFullName(_user.getFullName());
        oUser.setUserName(_user.getUserName());

        return userRepository.save(oUser);
    }

    //DELETE
    public void deleteUser(Integer _id) {
        userRepository.deleteById(_id);
    }

    //GET ALL
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    //GET BY ID 
    public User getUserxId(Integer _id) {
        return userRepository.getReferenceById(_id);
    }

}