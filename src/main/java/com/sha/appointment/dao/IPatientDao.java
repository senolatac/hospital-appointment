package com.sha.appointment.dao;

import com.sha.appointment.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface IPatientDao extends CrudRepository<Patient, Long> {
}
