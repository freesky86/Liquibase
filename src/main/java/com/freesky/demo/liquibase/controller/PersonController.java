package com.freesky.demo.liquibase.controller;

import com.freesky.demo.liquibase.entity.Person;
import com.freesky.demo.liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/test")
    public String test() {
        return "Hello Liquibase";
    }

    @PostMapping("person")
    public String creatPerson(@RequestParam String name) {
        personRepository.save(new Person(name, "6.7"));
        return personRepository.findByName(name) + " Saved successfully!";
    }

    @GetMapping("person")
    public List<Person> findAllPerson() {
        return (List<Person>) personRepository.findAll();
    }
}
