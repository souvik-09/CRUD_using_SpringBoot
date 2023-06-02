package com.example.crud4.Services;

import com.example.crud4.Model.People;
import com.example.crud4.Repository.PeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl {


    @Autowired
    PeopleRepo peopleRepo;

    public People addPeople(People people){
        return peopleRepo.save(people);
    }

    public List<People> getAllPeoples(){
        return peopleRepo.findAll();

    }



    public People findPeopleById(Long id) {
        return peopleRepo.findById(id).get();
    }



    public void deleteById(Long id){
        peopleRepo.deleteById(id);
    }



}
