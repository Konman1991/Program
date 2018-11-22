package test;

import java.util.Random;

public class Generator {
	
	public static void n5() {
	
	 Random randomGen = new Random();{
	   
	   for(int counter=1; counter<=15; counter++){// This randomly picks 15 numbers between the range of 1 to 150
	 System.out.print(1 + randomGen.nextInt(150) + " ");
	  }
	
}
}
}
