package com.example.schoolmanagement.service;

import com.example.schoolmanagement.entity.Class;
import com.example.schoolmanagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    void deleteById(int id);
}
