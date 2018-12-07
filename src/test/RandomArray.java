/**
 * @author Konner Robbins
 */

package test;

import java.util.Arrays;

import java.util.Random;

/**
 * Random generated array.
 */

public class RandomArray {

  private static int[] theArray;

  /**
   * It randomly generates an arry picking 10 numbers from 1 to 50.
   */
  
  public static void n10() {
    System.out.println("Randomly generates numbers into an Array.");

    int smallest = Integer.MAX_VALUE;
    int highest = Integer.MIN_VALUE;

    theArray = new int[10];
    Random randomArray = new Random();
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      theArray[i] = randomArray.nextInt(100);
      sum += theArray[i];
      if (smallest > theArray[i]) {
        smallest = theArray[i];
      }
      if (highest < theArray[i]) {
        highest = theArray[i];
      }
    }

    System.out.println(Arrays.toString(theArray));
    System.out.println("Lowest value is: " + smallest);// smallest value
    System.out.println("Hightest value is: " + highest);// largest value
    System.out.println("Sum of the Array: " + sum); // The total of the Array

  }
}
