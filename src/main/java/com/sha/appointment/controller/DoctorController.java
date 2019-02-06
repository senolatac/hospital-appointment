package com.sha.appointment.controller;

import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;
import com.sha.appointment.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    public List<Doctor> findDoctors(final TitleOfDoctor titleOfDoctor) {
        return doctorService.findDoctors(titleOfDoctor);
    }

    public Doctor saveDoctor(final Doctor doctor){
        doctorService.save(doctor);
        return doctor;
    }
}
