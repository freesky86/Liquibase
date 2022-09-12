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
        Person person = personRepository.save(new Person(name, "6.7"));
        return person.getName() + "(id=" + person.getId() + ")" + " Saved successfully!";
    }

    @PostMapping("add")
    public String addPerson(@RequestParam String name,
                            @RequestParam String height,
                            @RequestParam String address,
                            @RequestParam String birthday) {
        Person person = personRepository.save(new Person(name, height, address, birthday));
        return person.getName() + "(id=" + person.getId() + ")" + " Saved successfully!";
    }

    @PostMapping("delete")
    public String deletePerson(@RequestParam String name) {
        int id = personRepository.findByName(name);
        personRepository.deleteById(id);
        return name + " is deleted successfully!";
    }


    @GetMapping("person")
    public List<Person> findAllPerson() {
        return (List<Person>) personRepository.findAll();
    }
}
