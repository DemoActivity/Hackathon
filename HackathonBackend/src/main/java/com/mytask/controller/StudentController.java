package com.mytask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.entities.Student;
import com.mytask.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllGroups")
    public List<String> getAllGroups(){
    	System.out.println("In StudentController");
    	return studentService.getAllGroups();
    }
}
