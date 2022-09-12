package com.freesky.demo.liquibase.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="persons")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String height;

    @Column
    private String address;

    @Column
    private LocalDate birthday;

    private Person() {
        // for persistence
    }

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public Person(String name, String height, String address, String birthday) {
        this.name = name;
        this.height = height;
        this.address = address;

        String datePattern = "yyyy-MM-dd";
        try {
            LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern(datePattern));
            this.birthday = birthDate;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
