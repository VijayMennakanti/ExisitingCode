package javarivision;

public class Return {

	public static void main(String[] args) {
		
	int result=	addMethodOne(4,5);
	
	System.out.println(result+":"+"return value");
	
	}
	
	public static int addMethodOne(int a,int b) {
		
		int sum=a+b;
	//	System.out.println(sum);
		
		return sum;
	}

}
