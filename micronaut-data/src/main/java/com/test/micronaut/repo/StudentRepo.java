package com.test.micronaut.repo;

import com.test.micronaut.entity.Student;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.repository.CrudRepository;

@Repository

public interface StudentRepo extends JpaRepository<Student,Long> {
}
