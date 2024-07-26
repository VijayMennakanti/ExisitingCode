package pack5;

public class Object {

	public static void main(String[] args) {
		
	String bankName="Axis";
	Bank b= null;
	
	if(bankName.equalsIgnoreCase("Hdfc")) {
		b= new Hdfc();
		}else if(bankName.equalsIgnoreCase("Axis")) {
			
			b=new Axis();
		}

	
	System.out.println(Bank.AccountTypeOne);
	System.out.println(Bank.AccountTypeTwo);
	b.depositMoney();
	b.transferMoney();
    


	}

}
