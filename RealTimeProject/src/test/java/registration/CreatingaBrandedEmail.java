package registration;

import java.util.Date;

public class CreatingaBrandedEmail {

	public static void main(String[] args) {
		
		Date date =new Date();
		
		String email = date.toString().replace(" ", "_").replace(":","_")+"@gmail.com";
		
		System.out.println(email);
	}

}
