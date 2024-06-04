package com.example.demo.repository.impl;

import com.example.demo.exception.PersonNotFoundException;
import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Repository
public class PersonRepositoryImpl implements PersonRepository {



    private static Map<String, Person> personMap = new HashMap<>();
    private static int count= 0;
    static {
        Person person1 = new Person();
        person1.setId("1");
        person1.setName("Honey");
        personMap.put(person1.getId(), person1);
        count++;

        Person person2 = new Person();
        person2.setId("2");
        person2.setName("Almond");
        person2.setLastName("Jhonson");
        personMap.put(person2.getId(), person2);
        count++;
    }

    @Override
    public Person getPerson(String id) {

        System.out.println(personMap);

        if(personMap.containsKey(id))
            return personMap.get(id);

        throw new PersonNotFoundException();
    }

    @Override
    public void createPerson(String name, String lastName) {

        System.out.println("SE HA CREADO LA PERSONA CORRECTAMENTE "+name+" "+lastName);

        Person person = new Person();
        person.setId(String.valueOf(count));
        person.setName(name);
        person.setLastName(lastName);
        personMap.put(person.getId(), person);
        count++;
    }
}
