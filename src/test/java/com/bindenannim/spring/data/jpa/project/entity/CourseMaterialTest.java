package com.bindenannim.spring.data.jpa.project.entity;

import com.bindenannim.spring.data.jpa.project.repository.CourseMaterialRepository;
import com.bindenannim.spring.data.jpa.project.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;
//    @Autowired
//    private CourseRepository courseRepository;

    @Test
    public void SaveCourseMaterial(){
        Course course = Course.builder()
                .title("Java8")
                .title("Java17")
                .credit(8)
                .credit(15)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .url("www.w3school.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);


    }
@Test
    public void printAllCourseMaterials(){
    List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
    System.out.println("Course material =" + courseMaterials);


    }
//    @Test
//    public void printAllCourses(){
//        List<Course> courses = courseRepository.findAll();
//        System.out.println(" The courses =" + courses);
//
//    }


}