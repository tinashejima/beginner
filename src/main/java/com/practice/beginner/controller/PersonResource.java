package com.practice.beginner.controller;


import com.practice.beginner.entity.Person;
import com.practice.beginner.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person")
public class PersonResource {

    private final PersonService personService;

    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personService.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}
