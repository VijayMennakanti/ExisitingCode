package example;

public class demo {
	
	
	public static void main(String[] args) {
		
		int []a=new int[5];
		
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		
		for (int i= 0; i < a.length; i++) {
			
			if(a[i]>=25) {
				
				System.out.println(a[i]);
				System.out.println(i);
			}
			
		//	int sum=a[0]+a[1]+a[3]+a[4]+a[2];
		//	System.out.println(sum);
		//	System.out.println(a[i]);
		}
		
	}

}
