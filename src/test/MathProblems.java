/**
 * @author Konner Robbins
 */

package test;

import java.util.InputMismatchException;
import java.util.Scanner;

 /**
 * Multiple equations.
 */

public class MathProblems {

  /**
   * Enter inputs into Multiple equations.
   */
  
  public static void n1() {

    try (Scanner scanA = new Scanner(System.in);) {
      System.out.print("a = ");
      int nA = scanA.nextInt();

      try (Scanner scanB = new Scanner(System.in);) {
        System.out.print("b = ");
        int nB = scanB.nextInt();

        System.out.println("a + b = " + (nA + nB));
        System.out.println("a - b = " + (nA - nB));
        System.out.println("a * b = " + (nA * nB));
        System.out.println("a / b = " + (nA / nB));
        System.out.println("a % b = " + (nA % nB));// Operators
        System.out.println(" ++a  = " + (++nA));
        System.out.println(" --a  = " + (--nA));
        System.out.println(" ++b  = " + (++nB));
        System.out.println(" --b  = " + (--nB));
        System.out.println("a += a = " + (nA += nA));
        System.out.println("a += b = " + (nB += nB));

      } catch (InputMismatchException e) {
        System.out.println("InputMismatchException");
        {

        }
      }
    } catch (InputMismatchException e) {
      System.out.println("InputMismatchException");
      {
      } // end main method
    }
  }
}
