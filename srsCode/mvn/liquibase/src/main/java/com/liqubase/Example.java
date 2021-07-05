package com.liqubase;

import com.liqubase.dao.CityDao;
import com.liqubase.dao.StudentDao;
import com.liqubase.data.City;
import com.liqubase.data.Country;
import com.liqubase.data.Student;
import liquibase.pro.packaged.C;
import org.hibernate.Session;
import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmCollectionIdType;

import java.util.List;

public class Example {

    private static final String GET_COUNTRY_BY_NAME = "from Country where name = :stockName";
    private static final String GET_COUNTRY_BY_ABR = "from Country where abr = :abr";

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.save(new Country("Grate Britain", "GB"));
//        session.getTransaction().commit();


//        Query query = session.createQuery(GET_COUNTRY_BY_ABR);
//        query.setParameter("abr", "IT");
//        List list = query.list();
//
//        Country country = (Country) list.get(0);
//
//        System.out.println(country);


        CityDao cdao = new CityDao();
        cdao.getAllCities();
//
        StudentDao dao = new StudentDao();

        List<Student> students = dao.getAllCities();

        for (Student st : students)
            System.out.println(st.getFirstName() + " " + st.getLastName() );
    }
}
