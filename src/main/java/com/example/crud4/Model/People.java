package com.example.crud4.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long userId;
    String name;
    String email;
    String phone;


}
