/**
 * @author Konner Robbins
 */

package test;

import java.util.ArrayList;

/**
 * This an example of an Array list.
 */

public class ListArray {

  /**
   * This creates an array list.
   */
  
  public static void n11() {
    ArrayList<Integer> al = new ArrayList<Integer>(5);

    // add elements to the array list
    al.add(10);
    al.add(20);
    al.add(60);
    al.add(40);
    al.add(50);
    al.add(30);
    al.add(1, 0);
    System.out.println("Size of al after additions: " + al.size());

    // display the array list
    System.out.println("Contents of al: " + al);

    // Remove elements from the array list
    al.remove(6);
    al.remove(2);
    System.out.println("Size of al after deletions: " + al.size());
    System.out.println("Contents of al: " + al);
  }

}
