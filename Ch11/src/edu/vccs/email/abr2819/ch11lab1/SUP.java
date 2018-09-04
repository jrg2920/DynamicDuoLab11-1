package edu.vccs.email.abr2819.ch11lab1;

public class SUP extends Boat {
   public boolean IsInflatable;

   public String SUPStringMethod() {
      if (IsInflatable) {
         return "is";
      }
      else {
         return "is not";
      }
   }

   @Override
   public String toString() {
      return "This " + getLength() + " ft. " +
          "SUP "  + SUPStringMethod() +
          " inflatable.";
   }
}
