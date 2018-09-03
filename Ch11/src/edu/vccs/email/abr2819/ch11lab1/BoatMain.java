package edu.vccs.email.abr2819.ch11lab1;

/**
 * create different kinds of Boats using polymorphism
 * 2018-08-28
 * @author john maxfield
 */
public class BoatMain {
   public static void main(String[] args) {
      Boat[] boats = new Boat[3];            // array of Boat objects (all sub-class objects)

      // create 3 objects
      boats[0] = new PowerBoat();
      boats[1] = new SUP();
      boats[2] = new PWC();

      // set all the attributes
      boats[0].setLength(17.0);
      ((PowerBoat)boats[0]).setName("Lucky");
      ((PowerBoat)boats[0]).setHp(65.0);
      boats[1].setLength(10.4);
      ((SUP)boats[1]).IsInFlatable=false;

      for (Boat boat : boats) {
         System.out.println(boat);
         if (boat instanceof BoatWithEngine) {
            System.out.println("Engine hp: " + ((BoatWithEngine)boats[0]).getHP());
         }
      }
   }
}
