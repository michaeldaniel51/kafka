package com.demo.kafka.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> getPersons() {
    return personService.getPersons();
    }





}
