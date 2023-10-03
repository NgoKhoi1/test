package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.*;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    void deleteById(int id);
    List<Student> findByName(String name);
}
