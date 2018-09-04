package edu.vccs.email.abr2819.ch11lab1;

/**
 * gets and sets hp for a PWC boat
 * prints string statement based on values from object creation
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public class PWC extends Boat implements BoatWithEngine{
   private double HP;     // hp value for a PWC boat

   /**
   * gets the value for PWC boat hp
   * @return hp value of PWC boat
   */
   public double getHP() {
      return HP;
   }

   /**
   * sets the value for PWC boat hp
   * @param HP value of PWC boat
   */
   @Override
   public void setHP(double HP) {
      this.HP = HP;
   }

   /**
   * prints string with length of PWC boat
   * @return string with length of PWC boat
   */
   @Override
   public String toString() {
      return "This is a " + getLength() +
          " ft. PWC.";
   }
}
