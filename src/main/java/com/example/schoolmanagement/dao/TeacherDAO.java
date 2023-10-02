package com.example.schoolmanagement.dao;

import com.example.schoolmanagement.entity.Professional;
import com.example.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> findAll();
    Teacher findById(int id);
    Teacher save(Teacher teacher);
    void deleteById(int id);
}

