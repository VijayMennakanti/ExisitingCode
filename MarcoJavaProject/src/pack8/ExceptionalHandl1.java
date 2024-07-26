package pack8;

import java.util.Scanner;

public class ExceptionalHandl1 {

	public static void main(String[] args) {
		
		int a= 9;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println(" Enter any number :");
		
		int  b= scanner.nextInt();
		 scanner.close();
		int c=a/b;          // if we enter b=0 then we will get exception and the steps after the exception wont execute
		 
		 System.out.println(c); // for this reason we have to use Exceptional Handling methods
		
		
		

	}

}
