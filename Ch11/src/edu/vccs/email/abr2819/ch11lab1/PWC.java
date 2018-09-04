package edu.vccs.email.abr2819.ch11lab1;

/**
 *
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public class PWC extends Boat implements BoatWithEngine{
   private double HP;

   public double getHP() {
      return HP;
   }

   @Override
   public void setHP(double HP) {
      this.HP = HP;
   }

   @Override
   public String toString() {
      return "This is a " + getLength() +
          " ft. PWC.";
   }
}
