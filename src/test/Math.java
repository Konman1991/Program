package test;
import java.util.Scanner;

public class Math {
	
	public static void n2() {
		
     Scanner scanA = new Scanner( System.in );
        System.out.print("a = ");
        	int nA = scanA.nextInt();
        		
     Scanner scanB = new Scanner( System.in );
        System.out.print("b = ");
        	int nB = scanB.nextInt();
        	
        System.out.println( "a + b = " + (nA + nB));
        System.out.println( "a - b = " + (nA - nB));
        System.out.println( "a * b = " + (nA * nB));
        System.out.println( "a / b = " + (nA / nB));
        System.out.println( "a % b = " + (nA % nB));
        System.out.println( " ++a  = " + (++nA));
        System.out.println( " --a  = " + (--nA));
        System.out.println( " ++b  = " + (++nB));
        System.out.println( " --b  = " + (--nB));
        System.out.println( "a += a = " + (nA += nA));
        System.out.println( "a += b = " + (nB += nB));
        scanA.close();
        scanB.close();
    } // end main method


		
		
	}
		