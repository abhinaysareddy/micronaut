package com.test.micronaut.repo;

import com.test.micronaut.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
