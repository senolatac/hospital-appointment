package com.sha.appointment.service;

import com.sha.appointment.dao.IPersonDao;
import com.sha.appointment.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private IPersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
