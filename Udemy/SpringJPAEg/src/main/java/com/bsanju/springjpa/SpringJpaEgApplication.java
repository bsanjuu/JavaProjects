package com.bsanju.springjpa;

import com.bsanju.springjpa.model.Student;
import com.bsanju.springjpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaEgApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJpaEgApplication.class, args);

        StudentRepo studentRepo =context.getBean(StudentRepo.class);
//        Student s1 = context.getBean(Student.class);
//        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(1);
//        s1.setName("Sanju");
//        s1.setMarks(90);
//
//        s2.setRollNo(2);
//        s2.setName("Rishi");
//        s2.setMarks(80);
//
//        s3.setRollNo(3);
//        s3.setName("Nithi");
//        s3.setMarks(95);
//
//        studentRepo.save(s1);
//        studentRepo.save(s2);
//        studentRepo.save(s3);

//        System.out.println(studentRepo.findAll());
//        Optional<Student> student = studentRepo.findById(103);
//        System.out.println(student.orElse(new Student()));
        System.out.println(studentRepo.findByName("Sanju"));



    }

}
