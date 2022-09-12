package com.freesky.demo.liquibase.entity;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PersonTest {

    @Test
    public void testDate() {
        String birthday = "1948-10-11";
        String datePattern = "yyyy-MM-dd";
        try {
            LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern(datePattern));
            System.out.println(birthDate);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }


}