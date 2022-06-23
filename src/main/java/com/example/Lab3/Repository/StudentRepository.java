package com.example.Lab3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Lab3.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
