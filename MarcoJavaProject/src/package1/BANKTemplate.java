package package1;

public class BANKTemplate {
	
	
	String accountTypeOne;
	String accountTypeTwo;
	
	public void depositAccount( int a , int b) {
		
		
		int sum=a+b;
		System.out.println(a+b);
		System.out.println("***please deposit the money in my Saving Account***");
		
	}
	
	public void withdrawAccount( long a) {
		
		long sum=a+1000L;
		System.out.println(a+1000L);
		
		System.out.println("***please withdraw the money from my saving Account***");
		
	}
	
	
	

}
