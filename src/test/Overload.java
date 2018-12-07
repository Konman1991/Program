package test;
/**
 * This class is an example of method Overloading.
 * @author Konner Robbins
 */

public class Overload {
  /**
  * It overload things.
  *
  */
  public static void n7() {
    /*
     * @param hi
     */
    Overload obj = new Overload();
    obj.disp(1);
    obj.disp(1, 2);
    obj.disp(1, 2, 3);
  }
  /*
  * @param a is the first int of the Overload method.
  * @param b is the second int of the Overload method.
  * @param c is the third int of the Overload method.
  */
  
  private void disp(int a) {
    System.out.print(a + " ");
  }

  private void disp(int a, int b) {
    System.out.print(a + b + " ");
  }

  private void disp(int a, int b, int c) {
    System.out.print(a + b + c);
  }
}