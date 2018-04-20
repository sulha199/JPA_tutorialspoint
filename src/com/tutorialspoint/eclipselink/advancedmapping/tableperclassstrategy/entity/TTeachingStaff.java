package com.tutorialspoint.eclipselink.advancedmapping.tableperclassstrategy.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class TTeachingStaff extends TStaff {
   private String qualification;
   private String subjectexpertise;

   public TTeachingStaff( int sid, String sname, String qualification, String subjectexpertise ) {
      super( sid, sname );
      this.qualification = qualification;
      this.subjectexpertise = subjectexpertise;
   }

   public TTeachingStaff( ) {
      super( );
   }

   public String getQualification( ){
      return qualification;
   }
   
   public void setQualification( String qualification ) {
      this.qualification = qualification;
   }

   public String getSubjectexpertise( ) {
      return subjectexpertise;
   }

   public void setSubjectexpertise( String subjectexpertise ){
      this.subjectexpertise = subjectexpertise;
   }
}
