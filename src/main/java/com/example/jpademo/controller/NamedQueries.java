package com.example.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.jpademo.model.Employee;

public class NamedQueries {

    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emfactory.createEntityManager();
        
        Query query = entityManager.createNamedQuery("find employee by id");
        
        query.setParameter("id", 1204);
        List<Employee> list = query.getResultList();
        
        for(Employee e : list) {
            System.out.print("Employee ID: " + e.getEid());
            System.out.println("\tEmployee Name: " + e.getEname());
        }
    }

}
