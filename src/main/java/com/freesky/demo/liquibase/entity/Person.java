package com.freesky.demo.liquibase.entity;

import lombok.Data;

import javax.persistence.*;

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

    private Person() {
        // for persistence
    }

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }
}
