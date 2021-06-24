package com.projects.example.hibernate.base.entity;

import com.projects.example.hibernate.base.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class MainStudent {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query q = session.createQuery("From Student");

        List<Student> resultList = q.list();
        System.out.println("num of users :" + resultList.size());
        for (Student student : resultList) {
            System.out.println(student);
        }

    }


}

