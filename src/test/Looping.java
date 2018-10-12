package test;

import java.util.Scanner;

public class Looping {
	public static void n4 () {
	    Scanner scanner = new Scanner(System.in);
	    boolean continueProgram = true;
	    int menuChoice = 0;
	    while (continueProgram) {
	    	
	      // Questioning  program
	      System.out.println("Do you want to answer some Questions?\nIf yes enter 1\nIf no enter 2");
	      menuChoice = scanner.nextInt();
	      if (menuChoice == 1) {
	    	  System.out.println("Awesome. Here is the first question."+ System.lineSeparator() + " ");
	    	  
	      } else {
	    	  System.out.println("Fine be that way" + System.lineSeparator() + " ");
	    	  menuChoice = scanner.nextInt();
	      }
	      
	      System.out.println("Which is better? Dogs or Cats?\nEnter 1 for Dogs\nEnter 2 for Cats.");
	      menuChoice = scanner.nextInt();
	      if (menuChoice == 1) {
	    	  System.out.println("Good. Dogs are the best.\nOkay. Next question.\n");
	      
	      } else {System.out.println("BAD! CATS ARE EVIL!\nOkay. Next question.\n");
	      
	     }
		  
	      System.out.println("Which do you prefer? Pen or Pencil?\nEnter 1 for Pens\nEnter 2 for Pencils.");
	      menuChoice = scanner.nextInt();
		  if (menuChoice == 1) {
			  System.out.println("Pens are nice but it can smears\n");
		    	  
		 } else { 
		    	  System.out.println("Pencils are nice but they break too easilie.\n");
		    	  menuChoice = scanner.nextInt();
		 }
	    scanner.close();
	}
	}
	}
	
	
	
