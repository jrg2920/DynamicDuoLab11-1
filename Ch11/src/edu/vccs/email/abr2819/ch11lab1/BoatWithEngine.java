package edu.vccs.email.abr2819.ch11lab1;

/**
 * interface for getting and setting boat hp for powerboats and PWCs
 * 2018-09-05
 * @author Brad Ridder
 * @author Jhanavi Ghadia
 */
public interface BoatWithEngine {
   
   /**
   * method header for getting boat hp
   */
   double getHP();
   
   /**
   * method header for setting boat hp
   * @param HP value for boat with an engine
   */
   void setHP(double HP);
}

