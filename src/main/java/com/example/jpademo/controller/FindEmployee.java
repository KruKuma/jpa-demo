package com.example.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.jpademo.model.Employee;

public class FindEmployee {

    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        
        EntityManager entityManager = emfactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        Employee employee = entityManager.find(Employee.class, 1201);
        
        System.out.println("Employee ID = " + employee.getEid());
        System.out.println("Employee Name = " + employee.getEname());
        System.out.println("Employee Salary = " + employee.getSalary());
        System.out.println("Employee Designation = " + employee.getDeg());

    }

}
