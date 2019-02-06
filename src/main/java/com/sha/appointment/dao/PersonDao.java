package com.sha.appointment.dao;

import com.sha.appointment.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class PersonDao implements IPersonDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Person> findAll(){
        String hql = "Select p from Person p";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }
}
