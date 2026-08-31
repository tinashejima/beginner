package com.practice.beginner.controller;


import com.practice.beginner.entity.Person;
import com.practice.beginner.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

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
    @GetMapping("/person-list")
    public ResponseEntity<List<Person>>getPersonList(){
        List<Person> list = personService.findMany();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Person> getPersonById(@PathVariable("id") String personId){
        Person person = personService.getById(personId).get();
        return new ResponseEntity<>(person, HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByPersonId(@PathVariable("id") String personId){
        if (personId != null) {
            personService.deleteById(personId);

        }
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
