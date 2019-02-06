package com.sha.appointment.controller;

import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DoctorControllerTest {

    @Autowired
    private DoctorController doctorController;

    @Test
    public void doctorsShouldBeListedAccordingToTitle(){
        List<Doctor> doctors = doctorController.findDoctors(TitleOfDoctor.PROF);

        Assert.assertEquals(0, doctors.size());
    }

    @Test
    public void doctorShouldBeSaved(){
        Doctor doctor = new Doctor();
        doctor.setFirstName("Ally");
        doctor.setLastName("Beckham");
        doctor.setEmail("ally@xmail.com");
        doctor.setGraduationDate(LocalDate.now());
        doctor.setTitle(TitleOfDoctor.INTERN);
        doctorController.saveDoctor(doctor);

        Assert.assertNotNull(doctor.getId());
    }
}
