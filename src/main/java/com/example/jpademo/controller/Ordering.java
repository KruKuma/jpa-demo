package com.example.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.jpademo.model.Employee;

public class Ordering {

    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emfactory.createEntityManager();
        
        Query query = entityManager.createQuery("Select e from Employee e ORDER BY e.ename ASC");
        
        List<Employee> list = (List<Employee>)query.getResultList();
        
        for(Employee e : list) {
            System.out.println("Employee ID: " + e.getEid());
            System.out.println("Employee Name: " + e.getEname());
        }
    }

}
