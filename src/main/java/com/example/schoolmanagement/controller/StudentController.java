package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.entity.Student;
import com.example.schoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getAllStudent(){
        return studentService.findAll();
    }

    @GetMapping("/{studentid}")
    public Student getStudentById(@PathVariable int studentid){
        return studentService.findById(studentid);
    }

    @PostMapping("")
    public Student addNewStudent(@RequestBody Student student){
        student.setId(0);
        return studentService.save(student);
    }

    @PutMapping("")
    public Student updateStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("")
    public void deleteStudent(@RequestParam(value = "id") int id){
        studentService.deleteById(id);
    }
}
