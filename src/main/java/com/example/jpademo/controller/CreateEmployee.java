package com.example.jpademo.controller;

import com.example.jpademo.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        
        EntityManager entityManager = emfactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        
        Employee employee = new Employee( ); 
        employee.setEid( 1201 );
        employee.setEname( "Gopal" );
        employee.setSalary( 40000 );
        employee.setDeg( "Technical Manager" );
        
        entityManager.persist( employee );
        entityManager.getTransaction( ).commit( );

        entityManager.close( );
        emfactory.close( );

    }
    
    
    
}
