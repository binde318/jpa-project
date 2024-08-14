package com.bindenannim.spring.data.jpa.project.repository;

import com.bindenannim.spring.data.jpa.project.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
