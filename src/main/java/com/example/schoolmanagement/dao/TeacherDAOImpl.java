package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAOImpl implements TeacherDAO{
    private EntityManager entityManager;

    @Autowired
    public TeacherDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Teacher> findAll() {
        TypedQuery<Teacher> typedQuery = entityManager.createQuery("from Teacher",Teacher.class);
        return typedQuery.getResultList();
    }

    @Override
    public Teacher findById(int id) {
        return entityManager.find(Teacher.class,id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return entityManager.merge(teacher);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(findById(id));
    }
}
