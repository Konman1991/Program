/**
 * @author Konner Robbins
 */

package test;

/** 
 *Displays different ammo types for different Handguns.
 */

public class Inherit {
  /**
   * Inheritance can be defined as the process 
   * where one class acquires the properties of another. 
   * With the use of inheritance the information is made 
   * manageable in a hierarchical order. The class which 
   * inherits the properties of other is known as subclass 
   * and the class whose properties are inherited is known 
   * as superclass. 
   * Benefits of using Inheritance:
   * Reusability
   * Extensibility
   * Data hiding
   * Overriding
   */
  
  public static void n8() {

    System.out.println("Ammo types for Handguns\n");
    Glock felix = new Glock();
    Colt1911 fido = new Colt1911();
    DesertEagle rex = new DesertEagle();
    HandGuns[] myGuns = { felix, fido, rex }; // polymorphism code
    for (HandGuns anWeapon : myGuns) {
      System.out.println(anWeapon.showGun());
      anWeapon.ammo();
    }
  }
}

