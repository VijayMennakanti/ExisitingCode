package Pacakage2Programmes;// even or odd number

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Enter input number:");
		
		int inputnumber= scanner.nextInt();
		
		if (inputnumber%2==0) {
			
			System.out.println(" given number " +inputnumber+ " is even");
				}
		else {
			
			
			System.out.println(" given number" +inputnumber+ " is odd" );
		}
		
	}


}
