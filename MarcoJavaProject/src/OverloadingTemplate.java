
public class OverloadingTemplate {
	
	
	public OverloadingTemplate () {
		
		System.out.println(10+2);
	}
	
	public OverloadingTemplate(int a) {        // with parameter int a
		
		System.out.println(a+1);
		
	}
   public OverloadingTemplate(int a,int b) {  // number of parameters
	   
	   
	   System.out.println(a+b);
	   
   }
   
   public OverloadingTemplate(int a, double b) { //variation in variable data type
	   
	   System.out.println(a-b);
	   
	   
   }
   
	
	public OverloadingTemplate(double a,int b) { // order of parameters
		
		
		System.out.println(a*b);
	}
	

}
