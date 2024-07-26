package pack1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Waiting for an Alert to be present
Sometimes, we have to wait for the alert before we perform any operations on the alert*/
public class Synchronization3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	
	driver.findElement(By.id("alert1")).click(); 
	 
	          WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	          myWait.until(ExpectedConditions.alertIsPresent());
	          
	         Alert alert = driver.switchTo().alert();
	        
	       String alertText = alert.getText();
	    
	       System.out.println(alertText);
	       alert.accept();
	
		

	}

}
