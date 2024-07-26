package arrayspack;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {


		int [][]a= new int [3][2];  // 3-rows and 2-columns
		
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		
		a[2][0]=5;
		a[2][1]=6;
		
		int  size=0;
	
	//	System.out.println(a.length);   // size is nothing but number of rows.
	
	for(int i =0;i<a.length;i++) {       // It gives the row size
		
	//	size +=a[i].length;
//		int[] singleRow=a[i];              // size 2
		
		for(int j=0;j<a[i].length;j++) {       // column size 2  , for(int j=0;j<a[i.length;j++)
			
			System.out.print(a[i][j]+" ");      // a[i][j]
			
		}
		
		System.out.println();
	//	System.out.println(size);
	}	
		
		
	}
   
}
