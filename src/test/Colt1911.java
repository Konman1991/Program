/**
 * @ author Konner Robbins
 */

package test;

/**
 * A gun type class extension of HandGuns class.
 */

public class Colt1911 extends HandGuns  {
  
  /**
   * Gun type.
   */
  public Colt1911() {
    gun = "Colt 1911"; // demonstrates inheritance
  }

  /**
   * Name of Gun type.
   * @return Gun type name.
   */
  
  public String showGun() {
    return "Colt 1911";
  }
  
  /**
 * Prints ammo type for gun.
 */
  
  public void ammo() {
    System.out.println(".45 ACP caliber\n");
  }

}

