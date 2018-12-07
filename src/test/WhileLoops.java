/**
 * @author Konner Robbins
 */

package test;

/**
 * The continue statement is mostly used inside loops and
 * it skips the execution statements inside the loop's body.
 * The break statement when encountered in a loop, the control 
 * comes out of the the loop and the loop get terminated for the rest of the iterations.
 */

public class WhileLoops {

  /**
   * The break statement when encountered in a loop, the control 
   *  comes out of the the loop and the loop get terminated for the rest of the iterations.
   */
  
  public static void n6() {
    // TODO Auto-generated method stub

    int counter = 10;
    while (counter >= 0) {

      if (counter == 5) {
        counter--;
        continue;
      }
      System.out.print(counter + " ");
      counter--;
    }

    System.out.println();

    int i = 10;
    do {
      System.out.print(i + " ");
      i--;
    } while (i > 0);

  }

}
