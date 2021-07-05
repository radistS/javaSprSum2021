package com.liqubase.dao;

import com.liqubase.HibernateUtil;
import com.liqubase.data.City;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class CityDao {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<City> getAllCities() {
        Criteria criteria = session.createCriteria(City.class);
        return criteria.list();
    }

}
