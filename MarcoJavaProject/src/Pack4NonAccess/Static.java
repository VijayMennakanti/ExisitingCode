package Pack4NonAccess;

public class Static {
	static String color= "blue";    // static variable access with in the static stuff other wise it will gives error
	String name="vijay";

	public static void main(String[] args) {
		
		
	    Static	s =new Static();            /*  object creation for static */
		System.out.println(s.name);
		System.out.println(color);
		sampleMethod();             // static methods access only static stuff
		s.sampleMethodTwo();
		
	}
                               /*Output:- vijay,blue,inside the sample method         */
	
	public  static void sampleMethod() {
		
		System.out.println("inside the sample method");
	
		          // if we want to access non-static stuff inside the static method we have to create object for that.
		}
	
	
	public void sampleMethodTwo() {
		
		
System.out.println("inside the sample method two");// but there is no rules to implement static methods in normal methods.
          sampleMethodThree();
	}
	public void sampleMethodThree() {
		
		
		System.out.println(color);     //implementing static variable in normal method
		sampleMethod();
		
	}
	
}
