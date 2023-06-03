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

    public People updatePeople(Long id, People updatedPeople) {
        People existingPeople = findPeopleById(id);
        if (existingPeople != null) {
            if (updatedPeople.getName() != null) {
                existingPeople.setName(updatedPeople.getName());
            }
            if (updatedPeople.getEmail() != null) {
                existingPeople.setEmail(updatedPeople.getEmail());
            }
            if (updatedPeople.getPhone() != null) {
                existingPeople.setPhone(updatedPeople.getPhone());
            }
            return peopleRepo.save(existingPeople);
        }
        return null;
    }

    public void deleteById(Long id){
        peopleRepo.deleteById(id);
    }



}
