package com.sha.appointment.service;

import com.sha.appointment.dao.IDoctorDao;
import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorService implements IDoctorService {

    @Autowired
    private IDoctorDao doctorDao;


    @Override
    public List<Doctor> findDoctors(final TitleOfDoctor titleOfDoctor) {
        return doctorDao.findDoctors(titleOfDoctor);
    }

    @Override
    public void save(final Doctor doctor) {
        doctorDao.save(doctor);
    }
}
