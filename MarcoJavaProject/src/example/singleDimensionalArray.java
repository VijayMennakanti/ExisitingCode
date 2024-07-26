package example;

public class singleDimensionalArray {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		int[]b= {5,10};
		
		for(int i:a) {
			
			for(int j:b) {
				
				
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			
		}
		
	}

}
