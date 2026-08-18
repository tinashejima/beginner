package com.practice.beginner.repository;

import com.practice.beginner.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String > {
    boolean existsById(String id);
}
