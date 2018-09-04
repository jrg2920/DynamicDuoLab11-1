package edu.vccs.email.abr2819.ch11lab1;

/**
 * create different kinds of Boats using polymorphism
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public class BoatMain {
   
   /**
   * creates different kinds of Boats using polymorphism
   * @param args unused
   */
   public static void main(String[] args) {
      Boat[] boats = new Boat[3];            // array of Boat objects (all sub-class objects)

      // creating 3 boat objects of various types within the boats array
      boats[0] = new PowerBoat();
      boats[1] = new SUP();
      boats[2] = new PWC();

      // sets all the attributes for created ArrayList "boats" objects
      boats[0].setLength(17.0);
      ((PowerBoat)boats[0]).setName("Lucky");
      ((PowerBoat)boats[0]).setHP(65.0);
      boats[1].setLength(10.4);
      ((SUP)boats[1]).IsInflatable=false;
      boats[2].setLength(11.1);
      ((PWC)boats[2]).setHP(200.0);

      // enhanced for loop to print boat engine hp for all boat objects
      for (Boat boat : boats) {
         System.out.println(boat);
         if (boat instanceof BoatWithEngine) {
            System.out.println("Engine hp: " + ((BoatWithEngine)boat).getHP());
         }
      }
   }
}
