/**
 * @author Konner Robbins
 */

package test;

import java.util.Random;

/**
  * Randomly generates numbers picking 15 numbers 
  * between the range of 1 to 150.
  */

public class Generator {
  
  /**
  * Random number generator.
  */
  
  public static void n5() {

    Random randomGen = new Random();
    {
      
      for (int counter = 1; counter <= 15; counter++) {
        System.out.print(1 + randomGen.nextInt(150) + " ");
      }
    }
  }
}
