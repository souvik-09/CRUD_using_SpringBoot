package com.example.crud4.Repository;

import com.example.crud4.Model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepo extends JpaRepository<People, Long> {
}
