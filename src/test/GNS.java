/**
 * @author Konner Robbins
 */

package test;

/** 
 * Getter and Setter class.
 */

public class GNS {

  /**
   * The setter is the breeds name.
   * Then printed out into the sentence.
   */
  
  public static void n12() {
    Dog Rex = new Dog();
    Rex.setBreed("PitBull");
    System.out.println("Aww it's soo cute! What breed? " + Rex.getBreed());
  }
}
