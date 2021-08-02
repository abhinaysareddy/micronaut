package com.test.micronaut.service;

import com.test.micronaut.entity.Student;
import com.test.micronaut.repo.StudentRepo;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class StudentServiceImpl {
    @Inject
    StudentRepo studentRepo;
    public List<Student> getAllStudents(){
        return   studentRepo.findAll();
    }

    public Student saveStudent(Student student) {

        studentRepo.save(student);
        return student;
    }

    public Optional<Student> findById(Long id) {

       return studentRepo.findById(id);


    }
}
