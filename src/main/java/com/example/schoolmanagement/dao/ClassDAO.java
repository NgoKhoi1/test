package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Class;

import java.util.List;

public interface ClassDAO {
    List<Class> findAll();
    Class findById(int id);
    Class save(Class c);
    void deleteById(int id);
}

