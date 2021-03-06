package com.sha.appointment.dao;

import com.sha.appointment.model.Doctor;
import com.sha.appointment.model.TitleOfDoctor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class DoctorDao extends AbstractGenericDao<Doctor> implements IDoctorDao {

    @Override
    public List<Doctor> findDoctors(final TitleOfDoctor titleOfDoctor){
        String hql = "Select d from Doctor d where d.title = :pTitle";
        Query query = em.createQuery(hql);
        query.setParameter("pTitle",titleOfDoctor);
        return query.getResultList();
    }
}
