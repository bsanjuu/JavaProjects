package com.bsanju.hibernate;

import org.springframework.boot.SpringApplication;
import com.bsanju.hibernate.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
//        SpringApplication.run(HibernateApplication.class, args);

        Student s1= new Student();
        s1.setsName("Sanju");
        s1.setRollNo(101);
        s1.setsAge(26);

        System.out.println(s1);


    }

}
