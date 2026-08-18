package com.practice.beginner.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Department extends Base{
    private String name;
    private String location;
    private Boolean isActive = Boolean.FALSE;

}
