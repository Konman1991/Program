package test;

public class Methods {
	
	public static void n5() {

		printIntro();

		// good method design
		// get values with specific variable names in main, send values to method, output returned value
		double lengthA = 20;
		double widthA = 30;
		System.out
		    .println("The area of Square A is " + getArea(lengthA, widthA));

		double lengthB = 15;
		double widthB = 25;
		System.out.println("The area of Square B is " + getArea(lengthB, widthB));

		// class demonstration
		//classDemo();
		}

		public static void printIntro() {
		System.out.println("YAAAAY...Methods!");
		} // closes printIntro

		public static double getArea(double length, double width) {
		return length * width;
		}
	
		}

