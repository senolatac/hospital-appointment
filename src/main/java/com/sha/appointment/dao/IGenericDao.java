package com.sha.appointment.dao;

import com.sha.appointment.model.IModel;
import org.hibernate.Session;

public interface IGenericDao<T extends IModel> {

    T find(final Long id);
    void save(final T entity);
    T update(final T entity);
    void delete(final Long id);
    T findReference(final Long id);
    Session getSession();
}
