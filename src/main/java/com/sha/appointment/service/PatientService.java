package com.sha.appointment.service;

import com.sha.appointment.dao.IPatientDao;
import com.sha.appointment.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientService implements IPatientService {

    @Autowired
    private IPatientDao patientDao;

    @Override
    public void save(final Patient patient){
        patientDao.save(patient);
    }
}
