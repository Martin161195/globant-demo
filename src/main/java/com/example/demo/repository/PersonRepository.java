package com.example.demo.repository;

import com.example.demo.models.Person;

public interface PersonRepository {

    Person getPerson(String name);

    void createPerson(String name, String lastName);
}
