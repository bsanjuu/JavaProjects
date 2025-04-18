package com.bsanju.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {

        Student s1 = new Student();


        s1.setRollNo(107);
        s1.setsName("Rishiii");
        s1.setsAge(23);


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);


        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }

}