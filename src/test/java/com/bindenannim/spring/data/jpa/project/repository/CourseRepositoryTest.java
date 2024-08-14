package com.bindenannim.spring.data.jpa.project.repository;

import com.bindenannim.spring.data.jpa.project.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printAllCourse(){
        List<Course> courses = courseRepository.findAll();
        System.out.println("This is the test class for courses  " + courses);
    }
}