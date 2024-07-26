package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert4 {

// Handling Authentication Pop-up:
	
	
	public static void main(String[] args) {
	
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://admin:admin@the-internet.herokuapp.com/");
		  
		  driver.findElement(By.linkText("Basic Auth")).click();

	}

}
