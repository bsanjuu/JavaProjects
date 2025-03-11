package com.bsanju.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDb {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        s2 = session.get(Student.class, 102);

        session.close();
        sf.close();
        System.out.println(s2);

    }

}