package com.example.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {

    public static void main(String[] args) {
       
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emfactory.createEntityManager();
        
        //Scalar function
        Query query = entityManager.createQuery("Select UPPER(e.ename) from Employee e");
        List<String> list = query.getResultList();
        
        for(String e:list) {
            System.out.println("Employee Name: " + e);
        }
        
        //Aggregate function
        Query query1 = entityManager.createQuery("Select MAX(e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary : " + result);

    }

}
