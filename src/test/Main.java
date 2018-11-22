//Konner Robbins
//This program is a test. It has no real purpose yet.

/* Greetings user. To interact with the program you first must run the program.
 * Once done, a menu will displayed show. To active it, you will have to enter
 * a number next to the item of your choosing. To go back to the menu, hit run again.
 */

package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		    int selection;
		    	try(Scanner scan = new Scanner(System.in);){

		    // This is the Display menu
		    System.out.println("Enter a #");
		    System.out.println("1. Math examples");
		    System.out.println("2. Strings");
		    System.out.println("3. Questions");
		    System.out.println("4. Methods");
		    System.out.println("5. Generator");
		    System.out.println("6. While and do-while Loops");
		    System.out.println("7. Overloading");
		    System.out.println("8. Inheritance");
		    System.out.println("9. Arrays");
		    System.out.println("10. Random Array");
		    System.out.println("11. Array List");
		    System.out.println("12. Getter & Setter");
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
		    case 6:
		    	WhileLoops.n6(); // while and do- while Loops with break and continue statements
		    	break;
		    case 7:
		    	Overload.n7(); //Overloading
		    	break;
		    case 8:
		    	Inherit.n8(); //Inheritance
		    	break;
		    case 9:
		    	Arrays.n9(); //Arrays
		    	break;
		    case 10:
		    	randomArray.n10(); //Arrays but randomly made
		    	break;
		    case 11:
		    	ListArray.n11(); //ArraysList
		    	break;
		    case 12:
		    	GNS.n12(); //Getter & setter
		    	break;
		    default:
		  System.out.println("Invalid selection");
		    }
		    }
		    catch(InputMismatchException e) {
		    	System.out.println("InputMismatchException");
		    }
		  }
		//end of method
	}



