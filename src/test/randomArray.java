package test;
import java.util.Random;
import java.util.Arrays;

public class randomArray{
	
	private static int[] theArray;
	
	   public static void n10() {
		   System.out.println("Randomly generates numbers into an Array.");
		   
		   int smallest = Integer.MAX_VALUE;
		   int highest = Integer.MIN_VALUE;
		   
	    theArray = new int[10];
	    Random randomArray = new Random();   
	    int sum = 0;   
		   for(int i=0; i<10; i++){// This randomly picks 10 numbers between the range of 1 to 50
			   	theArray[i] = randomArray.nextInt(100);
			   	sum += theArray [i];
			   	if(smallest > theArray[i] ) {
			   		smallest = theArray[i];
			   	}
			   	if(highest < theArray[i] ) {
			   		highest = theArray[i];
			   	}
		    	   	}
		  
		   System.out.println(Arrays.toString(theArray));
		   System.out.println("Lowest value is: " + smallest);// lowest value output
		   System.out.println("Hightest value is: " + highest);// highest value output
		   System.out.println("Sum of the Array: " + sum);  //The total of the Array
		   
	   }
}


