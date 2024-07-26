package Pack4NonAccess;

public  abstract class Abstract {
	
	String company;                // we cannot use abstract infront of variables
	
	
	public abstract void  startCar();// when we want to use abstract before method we have to remove body part of the method.
	
	public void stopCar() {
		
		
		System.out.println("The car has stopped by the customer");
		
	}
	

}
// we can not create object for the abstract non-access modifiers just we can inherit the properties from the classes and we must add the body in that classes when the inhertitation completed.
/*if we want to access the abstract non-access modifers we have to create object for the iherited class or child class */