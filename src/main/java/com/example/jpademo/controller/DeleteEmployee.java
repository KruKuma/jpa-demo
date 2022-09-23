package com.example.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.jpademo.model.Employee;

public class DeleteEmployee {

    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        EntityManager entityManager = emfactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        Employee employee = entityManager.find(Employee.class, 1201);
        
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        emfactory.close();
    }

}
