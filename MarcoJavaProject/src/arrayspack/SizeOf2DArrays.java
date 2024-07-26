package arrayspack;

public class SizeOf2DArrays {

	public static void main(String[] args) {
int [][]a= new int [3][2];  // 3-rows and 2-columns
		
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		
		a[2][0]=5;
		a[2][1]=6;
		
		int  size=0;
		
		for (int i=0;i<a.length;i++) {
			
			size +=a[i].length;
			
		}
        System.out.println(size);
	}

}
