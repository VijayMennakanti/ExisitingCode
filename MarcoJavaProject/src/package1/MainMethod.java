package package1;

public class MainMethod {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.Accountnumber="VIJAY";
		s.accountTypeOne="Saving";
		s.accountTypeTwo="cheque";
		s.depositAccount(10000, 5000);
		s.withdrawAccount(2000000L);
        s.freeGift("8");
	}

}
