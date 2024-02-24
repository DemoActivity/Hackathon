package com.mytask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytask.entities.Course;
import com.mytask.entities.CourseSubject;
import com.mytask.repo.CourseRepo;
import com.mytask.repo.CourseSubjectRepo;

@Service
public class CourseSubjectService {

	// Inject any necessary repositories or other dependencies
	@Autowired
	private CourseSubjectRepo courseSubjectRepo;

	public List<CourseSubject> getCourseSubjectsByCourseId(Long courseId) {
		return courseSubjectRepo.findByCourseCourseId(courseId);
	}
}