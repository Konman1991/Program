package test;


public class Overload{

	
	 public static void n7(){
		 
	       Overload obj = new Overload();
	       obj.disp(1);
	       obj.disp(1, 2);
	       obj.disp(1, 2, 3);
	       
	   }

	private void disp(int a) {
		// TODO Auto-generated method stub
		System.out.print(a+" ");
	}

	private void disp(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print(a + b+" ");
	}
	private void disp(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.print(a + b + c);
	}

		
	}
