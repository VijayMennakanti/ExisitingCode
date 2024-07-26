package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Waiting for an Element to be click-able
Sometimes, we have to wait for the UI element to be clickable, as it won’t be clickable by default
*/

public class Synchronization2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://verifalia.com/validate-email");
	
	driver.findElement(By.xpath("//div/input[@name='inputData']")).sendKeys("vijay");
	
    WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement validationButton = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']")));
    validationButton.click();
     
    String buttonText = validationButton.getText();
  
  System.out.println(buttonText);
	}

}
