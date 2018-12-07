/**
 * @author Konner Robbins
 */

package test;

import java.util.Scanner;

/**
 * String.
 */

public class Strings {
  
  /**
   * String being printed and show length of characters used.
   */
  
  public static void n2() {
    Scanner keyboard = new Scanner(System.in);

    // String methods
    System.out.println("I am Konner Robbins");
    String palindrome = "I am Konner Robbins"; // This String is a class
    int len = palindrome.length(); // and classes have methods
    System.out.println("The length of this string is " + len);

    // Yay methods

    keyboard.close();
  }

}
