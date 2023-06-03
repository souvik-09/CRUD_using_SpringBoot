package com.example.crud4.Controller;


import com.example.crud4.Model.People;
import com.example.crud4.Services.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people/")
public class PeopleController {
    @Autowired
    PeopleServiceImpl peopleServiceImpl;

    @GetMapping("getAllUsers")
    public List<People> getAllPeople(){
        return peopleServiceImpl.getAllPeoples();

    }

    @GetMapping("getPeople/{id}")
    public People getPeopleById(@PathVariable Long id){
        return peopleServiceImpl.findPeopleById(id);
    }

    @PostMapping("addPeople")
    public People addPeople(@RequestBody People people){
        return peopleServiceImpl.addPeople(people);
    }

    @PatchMapping("updatePeople/{id}")
    public People updatePeople(@PathVariable Long id, @RequestBody People updatedPeople) {
        return peopleServiceImpl.updatePeople(id, updatedPeople);
    }

    @DeleteMapping("deletePeople/{id}")
    public String deletePeople(@PathVariable Long id){
        peopleServiceImpl.deleteById(id);
        return "People successfully deleted!";
    }


}
