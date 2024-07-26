package pack8;

import java.util.Scanner;

public class Exceptional2 {

	public static void main(String[] args) {
		

		int a= 9;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println(" Enter any number :");
		
		int  b= scanner.nextInt();
		 scanner.close();
		 int c;
		 try {
			 
	     System.out.println("vijay Mennakanti"); // if we enter correct 'b' value the given print statment in the try block executed
		 c=a/b;                                  // if we enter b=0 try not exceuted
		 }catch(Exception e) {
			 
			 b=1;
			 c=a/b;
			 System.out.println("Handling with Arthemathatic exception");
			 
		 }
		 
		 
		 System.out.println(c); 
		 System.out.println(b);	
		 System.out.println(a);
	}

}
