package com.example.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.jpademo.model.Employee;

public class BetweenAndLikeFunctions {

    public static void main(String[] args) {
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emfactory.createEntityManager();
        
        //Between
        Query query = entityManager.createQuery("Select e from Employee e where e.salary Between 30000 and 40000");
        
        List<Employee> list = (List<Employee>)query.getResultList();
        
        for(Employee e : list) {
            System.out.println("Employee ID: " + e.getEid());
            System.out.println("\tEmployee salary: " + e.getSalary());
        }
        
        //Like
        Query query1 = entityManager.createQuery("Select e from Employee e where e.ename LIKE 'M%'");
        
        List<Employee> list1 = (List<Employee>)query1.getResultList();
        
        for(Employee e : list1) {
            System.out.println("Employee ID: " + e.getEid());
            System.out.println("Employee name: " + e.getEname());
        }
    }

}
