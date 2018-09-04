package edu.vccs.email.abr2819.ch11lab1;

/**
 * gets and sets the name of the powerboat
 * gets and sets the hp value for powerboat
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public class PowerBoat extends Boat implements BoatWithEngine{
   private String name;    // name of powerboat
   private double HP;      // value of powerboat hp

   /**
   * gets the string for powerboat name
   */
   public String getName() {
      return name;
   }
   
   /**
   * sets the string for powerboat name
   */
   public void setName(String name) {
      this.name = name;
   }

   /**
   * gets the value for powerboat hp
   */
   public double getHP() {
      return HP;
   }
   
   /**
   * sets the value for powerboat hp
   */
   public void setHP(double HP) {
      this.HP = HP;
   }
   
    /**
   * prints string with length of powerboat
   */
   @Override
   public String toString() {
      return  "\'" + name + "\'" +
          " is a " + getLength() +
          " ft. power boat.";
   }
}
