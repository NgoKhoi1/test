package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Class;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassDAOImpl implements ClassDAO{
    private EntityManager entityManager;

    @Autowired
    public ClassDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Class> findAll() {
        TypedQuery<Class> typedQuery = entityManager.createQuery("from Class",Class.class);
        List<Class> list = typedQuery.getResultList();
        return list;
    }

    @Override
    public Class findById(int id) {
        return entityManager.find(Class.class,id);
    }

    @Override
    public Class save(Class c) {
        return entityManager.merge(c);
    }

    @Override
    public void deleteById(int id) {
        Class foundClass = findById(id);
        entityManager.remove(foundClass);
    }
}
