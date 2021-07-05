package com.liqubase.dao;

import com.liqubase.HibernateUtil;
import com.liqubase.data.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class StudentDao {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Student> getAllCities() {
        Criteria criteria = session.createCriteria(Student.class);
        return criteria.list();
    }

}
