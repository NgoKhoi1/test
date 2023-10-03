package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery = entityManager.createQuery("from Student",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        System.out.println("Deleted by id");
        entityManager.remove(findById(id));
    }

    @Override
    public List<Student> findByName(String name) {
        TypedQuery<Student> typedQuery = entityManager.createQuery("from Student where name ="+name,Student.class);
        return typedQuery.getResultList();
    }
}
