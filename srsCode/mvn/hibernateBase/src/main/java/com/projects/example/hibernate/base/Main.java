package com.projects.example.hibernate.base;

import com.projects.example.hibernate.base.entity.Address;
import com.projects.example.hibernate.base.entity.Sex;
import com.projects.example.hibernate.base.entity.User;
import com.projects.example.hibernate.base.entity.UserShort;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        User user = new User()
//                .setAge(37)
//                .setSex(Sex.M)
//                .setPasportNumber("XX234512")
//                .setPhone("380675644218");
//
//        User user1 = new User()
//                .setAge(55)
//                .setSex(Sex.F)
//                .setPasportNumber("XX244512")
//                .setPhone("380675634218");
//
//        User user2 = new User()
//                .setAge(44)
//                .setSex(Sex.U)
//                .setPasportNumber("XX234412")
//                .setPhone("380675642218");
//
//        user.setFirstName("ddd");
//        user.setLastName("dfd");
//
//        session.save(user);
//        session.save(user1);
//        session.save(user2);
//        session.getTransaction().commit();


       User user = new User()
                .setLastName("Stepurko")
                .setFirstName("Alex")
                .setAge(37)
                .setSex(Sex.M)
                .setPasportNumber("XX234513")
                .setPhone("380675644219")
                .setAddress(new Address()
                        .setZipCode("65000")
                        .setCountry("Ukraine")
                        .setCity("Odesa")
                        .setStreet("Kanatnaya 22")
                        .setFlat("2"));

        session.save(user);
        session.getTransaction().commit();

//        Query q = session.createQuery("From User");
//
//        List<User> resultList = q.list();
//        System.out.println("num of users :" + resultList.size());
//        for (User usr : resultList) {
//            System.out.println(usr);
//        }
//
//        q = session.createQuery("From UserShort");
//
//        List<UserShort> rList = q.list();
//        for (UserShort usr : rList) {
//            System.out.println(usr);
//        }

    }


}

