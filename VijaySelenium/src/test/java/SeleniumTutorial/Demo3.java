package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
	

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		String radioButtons="trans";
		
		if(radioButtons.equalsIgnoreCase("Male")) {
			
			driver.findElement(By.id("radio1")).click();
			
		} else if(radioButtons.equalsIgnoreCase("Female")) {
			
			driver.findElement(By.id("radio2")).click();
			
		}else {
			
			System.out.println("Test script got failed");
		}
		
		
	}

}
