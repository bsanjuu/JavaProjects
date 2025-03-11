package com.bsanju.jdbcproject;

import com.bsanju.jdbcproject.model.Student;
import com.bsanju.jdbcproject.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JdbcProjectApplication.class, args);
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Bob");
        s.setMarks(90);
        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students=service.getStudents();
        System.out.println(students);



    }

}
