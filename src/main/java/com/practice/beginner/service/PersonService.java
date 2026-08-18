package com.practice.beginner.service;

import com.practice.beginner.entity.Person;
import com.practice.beginner.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonService implements BeginnerService<Person, String> {
    private final PersonRepository personrepository;

    public PersonService(PersonRepository personRepository){
        this.personrepository = personRepository;
    }

    @Override
    public void save(Person person) {
        personrepository.save(person);

    }

    @Override
    public Optional<Person> getById(String id) {
        return personrepository.findById(id);

    }

    @Override
    public List<Person> findMany() {
        return personrepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        personrepository.deleteById(id);

    }

    @Override
    public void update(Person person, String id) {
        if (personrepository.existsById(id));


    }
}
