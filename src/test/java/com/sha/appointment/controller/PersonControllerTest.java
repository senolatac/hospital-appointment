package com.sha.appointment.controller;

import com.sha.appointment.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerTest {

    @Autowired
    private PersonController personController;

    @Test
    public void allPersonsShouldBeListed(){
        List<Person> personList = personController.findAll();

        Assert.assertEquals(2, personList.size());
    }
}
