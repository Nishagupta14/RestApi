package com.example.JPADemo.controller;

import com.example.JPADemo.entity.Student;
import com.example.JPADemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {

    @Autowired
    StudentRepo StudentRepo;
    @GetMapping("/save")
    public void SaveStudent(){
        Student student =new Student();
        student.setId(1);
        student.setName("Nisha");
        student.setCourse("CSE");
        student.setAddress("Gurgaon");

        StudentRepo.save(student);

    }
}
