package com.sha.appointment.dao;

import com.sha.appointment.model.IModel;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;

public class AbstractGenericDao<T extends IModel> implements IGenericDao<T>{

    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Class<T> entityClass =
            (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public T find(Long id) {
        return sessionFactory.getCurrentSession().find(entityClass, id);
    }

    @Override
    public void save(T entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

    @Override
    public T update(T entity) {
        return (T) sessionFactory.getCurrentSession().merge(entity);
    }

    @Override
    public void delete(final Long id) {
        sessionFactory.getCurrentSession().delete(findReference(id));
    }

    @Override
    public T findReference(final Long id) {
        return sessionFactory.getCurrentSession().getReference(entityClass, id);
    }
}
