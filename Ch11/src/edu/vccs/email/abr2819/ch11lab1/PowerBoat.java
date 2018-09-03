package edu.vccs.email.abr2819.ch11lab1;

public class PowerBoat extends Boat {
   private String name;
   private double HP;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setHp(double HP) {
      this.HP = HP;
   }

   public double getHp() {
      return HP;
   }

   @Override
   public String toString() {
      return "PowerBoat{" +
          "name='" + name + '\'' +
          ", hp=" + HP +
          '}';
   }
}