package com.sha.appointment.controller;

import com.sha.appointment.model.Patient;
import com.sha.appointment.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PatientController {

    @Autowired
    private IPatientService patientService;

    public Patient save(final Patient patient){
        patientService.save(patient);
        return patient;
    }
}
