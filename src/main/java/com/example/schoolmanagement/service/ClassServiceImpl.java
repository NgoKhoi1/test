package com.example.schoolmanagement.service;

import com.example.schoolmanagement.dao.ClassDAO;
import com.example.schoolmanagement.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClassServiceImpl implements ClassService{
    private ClassDAO classDAO;

    @Autowired
    public ClassServiceImpl(ClassDAO classDAO) {
        this.classDAO = classDAO;
    }

    @Override
    public List<Class> findAll() {
        return classDAO.findAll();
    }

    @Override
    public Class findById(int id) {
        return classDAO.findById(id);
    }

    @Override
    @Transactional
    public Class save(Class c) {
        return classDAO.save(c);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        classDAO.deleteById(id);
    }
}
