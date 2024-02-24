package com.mytask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.entities.Course;
import com.mytask.entities.CourseSubject;
import com.mytask.service.CourseService;
import com.mytask.service.CourseSubjectService;

@CrossOrigin("*")
@RestController
@RequestMapping("/courseSubject")
public class CourseSubjectController {
    
    @Autowired
    private CourseSubjectService courseSubjectService ;

    @GetMapping("/by-course")
    public List<CourseSubject> getAllCourses(@RequestParam("courseId") Long courseId) {
    	System.out.println("In CourseSubjectController courseId="+courseId);
        return courseSubjectService.getCourseSubjectsByCourseId(courseId );
    }
}