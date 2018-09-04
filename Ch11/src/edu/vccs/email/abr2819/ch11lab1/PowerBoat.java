package edu.vccs.email.abr2819.ch11lab1;

public class PowerBoat extends Boat implements BoatWithEngine{
   private String name;
   private double HP;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setHP(double HP) {
      this.HP = HP;
   }

   public double getHP() {
      return HP;
   }

   @Override
   public String toString() {
      return  "\'" + name + "\'" +
          " is a " + getLength() +
          " ft. power boat.";
   }
}