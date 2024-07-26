package Pacakage2Programmes;   // program for multiplication  table 5 X 1=5

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter input number:");
		
		int num=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			
			System.out.println(num +"x" +i+"="+(i*num ));
			
			
			
		}

	}

}
