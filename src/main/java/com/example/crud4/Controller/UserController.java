package com.example.crud4.Controller;


import com.example.crud4.Model.User;
import com.example.crud4.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }



    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteById(id);
        return "User successfully deleted!";
    }


}
