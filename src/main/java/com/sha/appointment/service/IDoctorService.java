package com.sha.appointment.service;

import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;

import java.util.List;

public interface IDoctorService {

    List<Doctor> findDoctors(final TitleOfDoctor titleOfDoctor);
    void save(final Doctor doctor);
}
