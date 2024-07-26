package arrayPrograms;

import java.util.Arrays;

public class program1 {

	static int average;

	public static void main(String[] args) {

		// 1.Print the sum of the integers in an integer array?[2,5,1,9,6]

		int a[] = { 2, 5, 1, 9, 6 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			// System.out.print(a[i]+" ");

			sum += a[i]; // a+=b-->a=a+b ===>>sum=sum+a[i];

		}
		System.out.println(sum);
		program2();

		System.out.println(average);

		program3();
		program4();

		Program5();
		
		Program6();
		Program7() ;
		Program8();
	}

	public static void program2() {

//2.Program Print the avearage of the integers in the Integer array?{2,5,3,9,6}		

		int b[] = { 2, 5, 3, 9, 6 };

		int sum = 0;

		for (int i = 0; i < b.length; i++) {

			sum += b[i]; // sum
			average = sum / b.length;
			// System.out.println(average);
		}

	}

	public static void program3() {

		// 3.program merge the two arrays?{"Tea","coffee"}{"milk","water","coke"}

		String a[] = { "Tea", "coffee" };
		String b[] = { "milk", "water", "coke" };

		int mergedLength = a.length + b.length; // calculate the length of the merged array.

		System.out.println(mergedLength); // length -5.

		String[] mergedArray = new String[mergedLength]; // creating the new array with the Calculated length.
         
		System.arraycopy(a, 0, mergedArray, 0, a.length); // copy elements of array1 into mergedArray.
		System.arraycopy(b, 0, mergedArray, a.length,b.length);// copy elements of array2 into mergedArray.
		
		System.out.println("3.Program :  Merged Array :"+ Arrays.toString(mergedArray));
		
		}
	
	public static void program4() {
		
	//	4.program merge the two arrays?{"Tea","coffee"}{"milk","water","coke"} by using the For-each loop.
		String a[] = { "Tea", "coffee" };
		String b[] = { "milk", "water", "coke" };

		int mergedLength = a.length + b.length; // calculate the length of the merged array.

	//	System.out.println(mergedLength); // length -5.

		String[] mergedArray = new String[mergedLength];
		
		
		int index=0;
		for(String element:a) {
			
			mergedArray[index++]=element;
			
			
		}for (String element:b) {
			mergedArray[index++]=element;
			
		}
		System.out.println("4.Program :  Merged Array For-each Loop :"+ Arrays.toString(mergedArray));
	}
	
	public static void  Program5() {	
 //5. program Find the maximum number in the array and print the index of the array along the number.
		

		int c[] = { 2, 5, 3, 9, 6 };
		
		int  maxnum=c[0];      // Assume the first element as maxium initially   
		int maxIndex=0;
		
		for(int i=0;i<c.length;i++) {
		
			if (c[i]>maxnum) {
				
				maxnum=c[i];   //Update max if a larger elment is found.
			 
				maxIndex=i;  // update maxIndex to the index of the new maximum element.
			
			}
			
		}
 
		System.out.println("5.Program :  Maximum number in the array: " +maxnum);
		System.out.println("Index of the maximum number :" +maxIndex);
		
	}
	
	// 6.Program find the min length word from an array and print along with its index.

	public  static void Program6() {
		
		
		String a[] = { "Tea", "coffee","milk", "water", "coke"};
		
		String minmum=a[0];
		int minIndex=0;
		
		for (int i=0;i<a.length;i++) {
			
			 
			if(a[i].length()<minmum.length()) {
			minmum=a[i];
			minIndex=i;
			}
		}
		
		System.out.println("6.Program :  Minimum length word: "+ minmum);
		System.out.println("Index of the minimum length word: "+ minIndex);
			}
	
	public  static void Program7() {
		
//7.Program  find the min length word from an array and print along with its index By USINg For-each loop.
		
		String a[] = { "Tea", "coffee","milk", "water", "coke"};

		String minmum=a[0];
		int minIndex=0;
		
		for (String word:a) {
			
			if(word.length()<minmum.length()) {
				
				minmum=word;
				
			}
			
		}
		System.out.println("7.Program :  Minimum length word: "+ minmum);
	
	}
	
	// 8.Program to print the give array in reverse order.
	
	public static void Program8() {
		
		String arr[] = { "Tea", "coffee","milk", "water", "coke"};
		
		System.out.println("Program 8: ");
		
		System.out.println("ORGINALAL ARRAY is : ");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Array in reverse order : ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
