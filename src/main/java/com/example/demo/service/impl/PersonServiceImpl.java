package com.example.demo.service.impl;

import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{


    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl( PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    @Override
    public Person getPerson(String id) {

            return personRepository.getPerson(id);
    }

    @Override
    public void createPerson(String name, String lastName) {

        personRepository.createPerson(name, lastName);

    }
}
