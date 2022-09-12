package com.freesky.demo.liquibase.repository;

import com.freesky.demo.liquibase.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT id FROM Person p WHERE p.name LIKE %:personName%")
    int findByName(String personName);
}
