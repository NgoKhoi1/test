package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Professional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessionalDAOImpl implements ProfessionalDAO{

    private EntityManager entityManager;

    @Autowired
    public ProfessionalDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Professional> findAll() {
        TypedQuery<Professional> typedQuery = entityManager.createQuery("from Professional",Professional.class);
        return typedQuery.getResultList();
    }

    @Override
    public Professional findById(int id) {
        return entityManager.find(Professional.class,id);
    }

    @Override
    public Professional save(Professional professional) {
        return entityManager.merge(professional);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(id);
    }
}
