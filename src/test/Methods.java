package test;

public class Methods {
	
	public static void n4() {

		printIntro();

		
		double lengthA = 20;
		double widthA = 30;
		System.out.print("20 * 30 = ?\n");
		System.out.println("The area of Square A is " + getArea(lengthA, widthA));

		double lengthB = 15;
		double widthB = 25;
		System.out.print("15 * 25 = ?\n");
		System.out.println("The area of Square B is " + getArea(lengthB, widthB));

		
	}//end of method

		public static void printIntro() {
		System.out.println("YAAAAY...Methods!");
		}

		public static double getArea(double length, double width) {
		return length * width;
		}
	
	}

