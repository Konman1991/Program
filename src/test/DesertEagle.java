/**
 * @author Konner Robbins
 */

package test;

/**
 * A gun type class extension of HandGuns class.
 */

public class DesertEagle extends HandGuns  {
  
  /**
   * Gun type.
   */
  
  public DesertEagle() {
    gun = "Desert Eagle";
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
    System.out.println(".50 caliber\n");
  }
}
