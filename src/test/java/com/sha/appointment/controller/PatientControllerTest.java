package com.sha.appointment.controller;

import com.sha.appointment.model.Patient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PatientControllerTest {

    @Autowired
    private PatientController patientController;

    @Test
    public void patientShouldBeSaved(){
        Patient patient = new Patient();
        patient.setFirstName("Patty");
        patient.setLastName("Beckham");
        patient.setEmail("patty@xmail.com");

        patientController.save(patient);

        Assert.assertNotNull(patient.getId());
    }
}
