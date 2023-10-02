package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Class;
import com.example.schoolmanagement.entity.Professional;

import java.util.List;

public interface ProfessionalDAO {
    List<Professional> findAll();
    Professional findById(int id);
    Professional save(Professional professional);
    void deleteById(int id);
}
