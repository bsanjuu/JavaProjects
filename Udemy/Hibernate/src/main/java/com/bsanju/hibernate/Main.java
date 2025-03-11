package com.bsanju.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(102);
        s1.setsName("Sanju");
        s1.setsAge(26);
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.bsanju.hibernate.Student.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);

        transaction.commit();
        System.out.println(s1);

    }

}