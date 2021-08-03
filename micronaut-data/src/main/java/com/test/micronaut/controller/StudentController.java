package com.test.micronaut.controller;


import com.test.micronaut.entity.Student;

import com.test.micronaut.service.StudentServiceImpl;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller("students")
public class StudentController {

    @Inject
    StudentServiceImpl studentService;


    @Get("{id}/verify/{name}")
    public HttpResponse<StudentBean>  validateStudent(@Valid @RequestBean StudentBean bean){
        return HttpResponse.ok(bean);
    }

    @Get("{id}")
    public HttpResponse<Student> getStudent(@PathVariable  Long id){

        Optional<Student> stOpt= studentService.findById(id);

        return stOpt.map(HttpResponse::ok).orElse(HttpResponse.notFound());
    }

    @Get
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @Post
    public Student create(@Body  Student student){
        return studentService.saveStudent(student);
    }
}
