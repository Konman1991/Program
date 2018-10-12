//Konner Robbins
//This program is a test. It has no real purpose yet.

/* Greetings user. To interact with the program you first must run the program.
 * Once done, a menu will displayed show. To active it, you will have to enter
 * a number next to the item of your choosing. To go back to the menu, hit run again.
 */

package test;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		    int selection;
		    		    Scanner scan = new Scanner(System.in);
		    // This is the Display menu
		    System.out.println("Enter a #");
		    System.out.println("1. Math examples");
		    System.out.println("2. Strings");
		    System.out.println("3. Questions");
		    System.out.println("4. Methods");
		    System.out.println("5. Generator");
		    selection = scan.nextInt();//Where input is entered.
		    switch(selection) {
		 
		    case 1:
		    	Math.n1(); //Math
		    	break;
		    case 2:
		    	Strings.n2(); //Strings
		    	break;
		    case 3:
		    	Looping.n3(); //Looping
		    	break;
		    case 4:
		    	Methods.n4(); //Methods
		    	break;
		    case 5:
		    	Generator.n5(); //Generator
		    	break;
		    default:
		    	System.out.println("Invalid selection");
		    }
		    scan.close();
		  }//end of method
	}


