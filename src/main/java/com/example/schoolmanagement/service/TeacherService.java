package com.example.schoolmanagement.service;

import com.example.schoolmanagement.entity.Class;
import com.example.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();
    Teacher findById(int id);
    Teacher save(Teacher teacher);
    void deleteById(int id);
}
