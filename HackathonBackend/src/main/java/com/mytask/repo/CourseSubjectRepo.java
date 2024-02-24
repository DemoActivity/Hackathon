package com.mytask.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytask.entities.CourseSubject;

public interface CourseSubjectRepo extends JpaRepository<CourseSubject, Long> {
	List<CourseSubject> findByCourseCourseId(Long courseId);
}
