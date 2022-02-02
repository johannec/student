package com.example.demo1.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // SELECT * FROM student WHERE email = email
    @Query("SELECT s FROM Student s WHERE s.email =?1") //Jbql not SQL. Therefor "Student" is the class (the entity), not the db table name
    Optional<Student> findStudentByEmail(String email);
}
