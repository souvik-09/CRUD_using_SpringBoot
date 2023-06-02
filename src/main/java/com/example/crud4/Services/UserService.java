package com.example.crud4.Services;

import com.example.crud4.Model.User;
import com.example.crud4.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();

    }



    public User findUserById(Long id) {
        return userRepo.findById(id).get();
    }



    public void deleteById(Long id){
        userRepo.deleteById(id);
    }



}
