package com.practice.beginner.entity;


import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Person extends Base{
    private String firstname;
    private String lastname;
    private LocalDate birthdate;

}
