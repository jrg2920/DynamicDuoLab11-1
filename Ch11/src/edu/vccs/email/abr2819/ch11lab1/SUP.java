package edu.vccs.email.abr2819.ch11lab1;

/**
 * Subclass under Boats that determines whether a SUP boat is inflatable or not
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public class SUP extends Boat {
   public boolean IsInflatable;   // true or false value whether the SUP is inflatable or not

   /**
    * method to set a string value whether the SUP is inflatable or not
    * @return String of whether the SUP is inflatable or not
    */
   public String SUPStringMethod() {
      if (IsInflatable) {
         return "is";
      }
      else {
         return "is not";
      }
   }

   /**
   * prints string with whether SUP is inflatable or not
   */
   @Override
   public String toString() {
      return "This " + getLength() + " ft. " +
          "SUP "  + SUPStringMethod() +
          " inflatable.";
   }
}
