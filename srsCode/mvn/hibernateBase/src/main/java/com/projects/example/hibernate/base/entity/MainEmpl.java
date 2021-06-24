package com.projects.example.hibernate.base.entity;

import com.projects.example.hibernate.base.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class MainEmpl {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query q = session.createQuery("Select e From EmployeesShort e where e.lastName " +
                "=:name");

        q.setParameter("name", "Tonsley");

        EmployeesShort empl = (EmployeesShort) q.uniqueResult();

        System.out.println(empl);

        empl.setFirstName(empl.getFirstName()+ "_mod");
        empl.setLastName(empl.getLastName()+ "_mod");

        session.save(empl);
        session.getTransaction().commit();



        }

    }




