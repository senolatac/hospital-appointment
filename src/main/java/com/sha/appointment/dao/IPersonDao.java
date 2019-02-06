package com.sha.appointment.dao;

import com.sha.appointment.model.Person;

import java.util.List;

public interface IPersonDao {
    List<Person> findAll();
}
