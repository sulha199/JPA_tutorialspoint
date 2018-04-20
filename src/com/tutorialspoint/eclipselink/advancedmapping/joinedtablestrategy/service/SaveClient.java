package com.tutorialspoint.eclipselink.advancedmapping.joinedtablestrategy.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorialspoint.eclipselink.advancedmapping.joinedtablestrategy.entity.*;

public class SaveClient {
   public static void main( String[ ] args ) {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-Tutspoint" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Teaching staff entity 
      JTeachingStaff ts1 = new JTeachingStaff(1,"Gopal","MSc MEd","Maths");
      JTeachingStaff ts2 = new JTeachingStaff(2, "Manisha", "BSc BEd", "English");
      
      //Non-Teaching Staff entity
      JNonTeachingStaff nts1 = new JNonTeachingStaff(3, "Satish", "Accounts");
      JNonTeachingStaff nts2 = new JNonTeachingStaff(4, "Krishna", "Office Admin");

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