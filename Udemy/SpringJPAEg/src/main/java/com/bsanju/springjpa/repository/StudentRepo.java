package com.bsanju.springjpa.repository;

import com.bsanju.springjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("select s from Student  where s.name=?")
    List<Student> findByName(String name);

}
