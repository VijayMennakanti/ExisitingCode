
public class BankTemplate {
	
	String customername;                                              // objects
	int Accountnumber;
	String   customerid;
	String Address;
	double intresrrate;
	int loans;
	long mobilenumber;
	public BankTemplate(String customername,int Accountnumber,String customerid, String Address,double intresrrate,int loans, long mobilenumber  ) {
		this.customername=customername;                     //constructor using class name no 
		this.Accountnumber=Accountnumber;
		this.customerid=customerid;
		this.Address=Address;
		this.intresrrate=intresrrate;
		this.loans=loans;
		this.mobilenumber=mobilenumber;
	}
	
	public  void bankAccount1() {                                    // method 1
		
		System.out.println("--First we create a bank account--");
		}
	
	public void forBankAccountNeed() {                               // method 2
		
		System.out.println("----Then we have to give some details about person");
		
	}
	public void depositMethod() {                                     // method 3
		
		System.out.println("to deposit money in the account we need:" + Accountnumber  );
		System.out.println("and we need customerid like:  "   +customerid);
		System.out.println("and we need mobile nuber like :  "   +mobilenumber  );
		System.out.println("and we need  Address like :  "   +Address     );
		System.out.println("-------------------------------");
		
		
		
		
	}

}
