package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.entity.Class;
import com.example.schoolmanagement.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    private ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping("")
    public List<Class> getAllClass(){
        return classService.findAll();
    }

    @GetMapping("/{classid}")
    public Class getClassById(@PathVariable int classid){
        return classService.findById(classid);
    }

    @PostMapping("")
    public Class addNewClass(@RequestBody  Class c){
        c.setId(0);
        return classService.save(c);
    }

    @PutMapping("")
    public Class updateClass(@RequestBody Class c){
        return classService.save(c);
    }

    @DeleteMapping("")
    public void removeClass(@RequestParam(value = "id") int id){
        classService.deleteById(id);
    }
}
