
public class OverloadingMathTem {
	
	int a,b,c,d;
	
	public void add() {           // overloading methods
		
		
		 int sum=a+1;
		 
		 System.out.println(a+1);
		}
	
	public void add( int a,int b) {
		
		int sum=a+b;
		System.out.println(a+b);
		
		}
	
	public void add (int a,int b,int c) {
		
		
		int multiplication =(a*b)+c;
		
		
		System.out.println((a*b)+c);
		
	}

}
