package com.sha.appointment.dao;

import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;

import java.util.List;

public interface IDoctorDao extends IGenericDao<Doctor> {
    List<Doctor> findDoctors(final TitleOfDoctor titleOfDoctor);
}
