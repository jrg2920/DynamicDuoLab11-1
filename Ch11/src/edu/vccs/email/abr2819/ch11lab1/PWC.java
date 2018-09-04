package edu.vccs.email.abr2819.ch11lab1;

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
