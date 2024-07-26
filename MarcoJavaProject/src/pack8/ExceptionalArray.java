package pack8;

import java.util.Scanner;

public class ExceptionalArray {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Array size:");
		
		int arraySize=scanner.nextInt();
		
		     int[]	ar  = new int [arraySize];
		     
		    	 for (int i=0;i<=arraySize;i++) {  // i<arraySize not giving any exception
		    		 
		    		try { ar[i]=i;  // exception handling
		    		
		    		
		    		}catch(Throwable e)  {  // we can also give EXCeption e, Array index outof bound exception
		    			
		    			
		    			System.out.println("Array Index outbound exception");
		    			
		    		}
		    		 
		    		 
		    		 
		    	 }for (int e:ar) {
		    		 
		    		 System.out.println(e); 
		    		 
		    	 }
		    	 
		     }
		     
	    
		        	   
		           }
		           

		
	


