package com.bindenannim.spring.data.jpa.project.repository;

import com.bindenannim.spring.data.jpa.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student>findByFirstName(String firstName);
}
