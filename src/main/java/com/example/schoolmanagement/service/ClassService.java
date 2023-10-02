package com.example.schoolmanagement.service;

import com.example.schoolmanagement.entity.Class;
import com.example.schoolmanagement.entity.Student;

import java.util.List;

public interface ClassService {
    List<Class> findAll();
    Class findById(int id);
    Class save(Class c);
    void deleteById(int id);
}
