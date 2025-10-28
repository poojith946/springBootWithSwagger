package com.studentDetails.springBootSwagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentDetails.springBootSwagger.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
