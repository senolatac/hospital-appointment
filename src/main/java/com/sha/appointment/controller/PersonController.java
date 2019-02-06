package com.sha.appointment.controller;

import com.sha.appointment.model.Person;
import com.sha.appointment.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private IPersonService personService;

    public List<Person> findAll(){
        return personService.findAll();
    }
}
