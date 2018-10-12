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
		    System.out.println("1. Cat?");
		    System.out.println("2. Math examples");
		    System.out.println("3. Strings");
		    System.out.println("4. Questions");
		    System.out.println("5. Methods");
		    System.out.println("6. Generator");
		    selection = scan.nextInt();//Where input is entered.
		    switch(selection) {
		    case 1:
		    	Cat.n1(); //
		    	break;
		    case 2:
		    	Math.n2(); //Math
		    	break;
		    case 3:
		    	Strings.n3(); //Strings
		    	break;
		    case 4:
		    	Looping.n4(); //Looping
		    	break;
		    case 5:
		    	Methods.n5(); //Methods
		    	break;
		    case 6:
		    	Generator.n6(); //Generator
		    	break;
		    default:
		    	System.out.println("Invalid selection");
		    }
scan.close();
		  }
	}


