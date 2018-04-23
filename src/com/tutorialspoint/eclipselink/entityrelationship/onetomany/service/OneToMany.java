package com.tutorialspoint.eclipselink.entityrelationship.onetomany.service;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entityrelationship.onetomany.entity.*;


public class OneToMany {
   public static void main(String[] args) {
   
   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-Tutspoint" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );

   //Create Employee1 Entity
   OEmployee employee1 = new OEmployee();
   employee1.setEname("Satish");
   employee1.setSalary(45000.0);
   employee1.setDeg("Technical Writer");

   //Create Employee2 Entity
   OEmployee employee2 = new OEmployee();
   employee2.setEname("Krishna");
   employee2.setSalary(45000.0);
   employee2.setDeg("Technical Writer");

   //Create Employee3 Entity
   OEmployee employee3 = new OEmployee();
   employee3.setEname("Masthanvali");
   employee3.setSalary(50000.0);
   employee3.setDeg("Technical Writer");

   //Store Employee
   entitymanager.persist(employee1);
   entitymanager.persist(employee2);
   entitymanager.persist(employee3);

   //Create Employeelist
   List<OEmployee> emplist = new ArrayList();
   emplist.add(employee1);
   emplist.add(employee2);
   emplist.add(employee3);

   //Create Department Entity
   ODepartment department = new ODepartment();
   department.setName("Development");
   department.setEmployeelist(emplist);

   //Store Department
   entitymanager.persist(department);

   entitymanager.getTransaction().commit();
   entitymanager.close();
   emfactory.close();
   }
}
