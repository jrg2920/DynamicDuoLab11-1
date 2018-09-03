package edu.vccs.email.abr2819.ch11lab1;

public class PWC extends Boat{
   private double HP;

   public double getHP() {
      return HP;
   }

   public void setHP(double hp) {
      this.HP = HP;
   }

   @Override
   public String toString() {
      return "PWC{" +
          "hp=" + HP +
          '}';
   }
}
