package edu.vccs.email.abr2819.ch11lab1;

/**
 * abstract boat class to get and set the length of the boat
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public abstract class Boat {
   private double length;  // length of boat
   
   /**
   * gets length value of boat
   * @return length of boat
   */
   public double getLength() {
      return length;
   }
   
   /**
   * sets length value of boat
   * @param length of boat
   */
   public void setLength(double length) {
      this.length = length;
   }
   
}

