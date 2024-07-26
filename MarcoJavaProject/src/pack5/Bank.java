package pack5;

public interface Bank {
	
	
	String AccountTypeOne= "Saving"; // in interface varibles defaultly taked as final or static
	String AccountTypeTwo="current";
	
	
	public void depositMoney(); // in interface method defaultly taked as abstract non-access modifer.
	public void transferMoney();

	
	
/*we can't create object for the interfaces but if we want to create object we have to inherit the classes form the parent classes by using the "IMPLEMENTS"       */
} 
// if we want to add new properties in the hdfc child we can add those in the hdfc
// as simillar as before we had created object for the abstract modifer in the abstract programme.
//when we had given interface to the child class that only inhertated the properties of interface 
