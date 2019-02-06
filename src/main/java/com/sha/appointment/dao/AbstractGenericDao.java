package com.sha.appointment.dao;

import com.sha.appointment.model.IModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public class AbstractGenericDao<T extends IModel> implements IGenericDao<T>{

    @PersistenceContext
    protected EntityManager em;

    protected Class<T> entityClass =
            (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public T find(Long id) {
        return em.find(entityClass, id);
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T update(T entity) {
        return em.merge(entity);
    }

    @Override
    public void delete(final Long id) {
        em.remove(findReference(id));
    }

    @Override
    public T findReference(final Long id) {
        return em.getReference(entityClass, id);
    }

    @Override
    public Session getSession() {
        return (Session) this.em.getDelegate();
    }
}
