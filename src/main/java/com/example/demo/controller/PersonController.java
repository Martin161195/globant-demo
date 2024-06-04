package com.example.demo.controller;

import com.example.demo.models.Person;
import com.example.demo.service.PersonService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Person> getPerson(@PathParam(value = "id") String id){

        Person person = personService.getPerson(id);

        return ResponseEntity.ok(person);
    }


}
