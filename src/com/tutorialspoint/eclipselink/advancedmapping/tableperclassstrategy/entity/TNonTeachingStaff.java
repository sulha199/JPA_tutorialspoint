package com.tutorialspoint.eclipselink.advancedmapping.tableperclassstrategy.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class TNonTeachingStaff extends TStaff {
   private String areaexpertise;

   public TNonTeachingStaff( int sid, String sname, String areaexpertise ) {
      super( sid, sname );
      this.areaexpertise = areaexpertise;
   }

   public TNonTeachingStaff( ) {
      super( );
   }

   public String getAreaexpertise( ) {
      return areaexpertise;
   }

   public void setAreaexpertise( String areaexpertise ) {
      this.areaexpertise = areaexpertise;
   }
}
