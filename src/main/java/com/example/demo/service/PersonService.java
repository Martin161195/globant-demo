package com.example.demo.service;

import com.example.demo.models.Person;

public interface PersonService {

    Person getPerson(String name);

    void createPerson(String name, String lastName);
}
