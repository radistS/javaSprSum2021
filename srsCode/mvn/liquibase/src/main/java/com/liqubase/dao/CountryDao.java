package com.liqubase.dao;

import com.liqubase.HibernateUtil;
import com.liqubase.data.Country;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class CountryDao {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Country> getAllCountries() {
        Criteria criteria = session.createCriteria(Country.class);
        return criteria.list();
    }

}
