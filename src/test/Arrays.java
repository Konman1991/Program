package test;

public class Arrays {
		  

		/*
		   * The main method
		   */
		  public static void n9() {
			      
			      System.out.println("One-Dimensional array:");// 1-D Array
			      int[] anArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, };//Declared, Instantiation, and Initialization

			      /*for (int i = 0; i < anArray.length; i++) {
				        System.out.println(anArray[i]);
				      }*/
			      for (int t : anArray) {//enhanced for loop
			    	  System.out.print(t+" ");
			      }
			      System.out.println("\nIndex position of 60 is: "+ findIndex(anArray, 60));
			      
			      
			      
			      System.out.println("\nTwo-Dimensional array:");// 2-D Array
			      
			      int[][] twoArray = { {1,3,5,7,9}, {2,4,6,8,10} }; //Declared, Instantiation, and Initialization
			      int indexI = 0;
			      int indexJ = 0;
			      int num = 8;
			      
			      for(int i=0;i<2; i++) {
			    	  for(int j=0;j<5; j++){  
			    		  
			    		  if (twoArray[i][j] == num) {
			    			  num = twoArray[i][j];
			    			  indexI = i;
			    			  indexJ = j;
			    		  }
			    	    System.out.print(twoArray[i][j]+" ");  
			    	  }  
			    	  System.out.println();
			    	  }
			      System.out.println(num);
			      System.out.print("The coordinates for 8: ("+indexI+","+indexJ+")\n");//Coordinates of value index
			     
			      
			      System.out.println("\nMulti-Dimensional array:");//Multi-D Array
			      int [][] multiArray = { 
			    		  {2, 4, 6, 8, 10},{12, 14, 16, 18, 20},   //Declared, Instantiation, and Initialization
			    		  {22, 24, 26, 28, 30},{32, 34, 36, 38, 40},
			    		  {42, 44, 46, 48, 50},{52, 54 ,56, 58, 60},
			    		  {62, 64, 66, 68, 70},{72, 74, 76, 78, 80},
			    		  {82, 84, 86, 88, 90},{92, 94, 96, 98, 100}
			    		  				};
			      for(int i=0;i<10;i++){  
			    	  for(int j=0;j<5;j++){  
			    	    System.out.print(multiArray[i][j]+" ");  
			    	  }  
			    	  System.out.println(); 
			    	 } 
			      
			      
			   }
		  
			  public static int findIndex(int arr[], int t) { //Identify the index
				  if (arr == null) { 
			            return -1; 
			        } 
			  
			        // find length of array 
			        int len = arr.length; 
			        int i = 0; 
			  
			        // traverse in the array 
			        while (i < len) { 
			  
			            // if the i-the element is t 
			            // then return the index 
			            if (arr[i] == t) { 
			                return i; 
			            } 
			            else { 
			                i = i + 1; 
			            } 
			        } 
			        return -1; 
			    } 
}
			  
