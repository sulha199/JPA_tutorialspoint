package com.tutorialspoint.eclipselink.advancedmapping.tableperclassstrategy.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.advancedmapping.tableperclassstrategy.entity.*;

public class SaveClient {
   public static void main( String[ ] args ) {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-Tutspoint" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Teaching staff entity 
      TTeachingStaff ts1 = new TTeachingStaff(1,"Gopal","MSc MEd","Maths");
      TTeachingStaff ts2 = new TTeachingStaff(2, "Manisha", "BSc BEd", "English");
      
      //Non-Teaching Staff entity
      TNonTeachingStaff nts1 = new TNonTeachingStaff(3, "Satish", "Accounts");
      TNonTeachingStaff nts2 = new TNonTeachingStaff(4, "Krishna", "Office Admin");

      //storing all entities
      entitymanager.persist(ts1);
      entitymanager.persist(ts2);
      entitymanager.persist(nts1);
      entitymanager.persist(nts2);

      entitymanager.getTransaction().commit();
      entitymanager.close();
      emfactory.close();
   }
}
