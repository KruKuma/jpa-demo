package com.example.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.jpademo.model.Employee;

public class UpdateEmployee {

    public static void main(String[] args) {
        
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        
        EntityManager entityManager = emfactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        Employee employee = entityManager.find(Employee.class, 1201);
        
        //before update
        System.out.println(employee);
        employee.setSalary(46000);
        entityManager.getTransaction().commit();
        
        //after update
        System.out.println(employee);
        entityManager.close();
        emfactory.close();

    }

}
