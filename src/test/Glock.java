/**
 * @author Konner Robbins
 */

package test;

/**
 * A class extension of HandGuns class.
 */

public class Glock extends HandGuns  {
  
  /**
   * Gun type.
   */
  
  public Glock() {
    gun = "Glock 22";
  }

  /**
   * Name of Gun type.
   * @return Gun type name.
   */
  
  public String showGun() {
    return gun;
  }

  /**
   * Prints ammo type for gun.
   */
  
  public void ammo() {
    System.out.println(".40 caliber\n");
  }
}

