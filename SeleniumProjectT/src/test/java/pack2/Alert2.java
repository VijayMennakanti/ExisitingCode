package pack2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//  Handling Confirmation Alerts:


public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		System.out.println("text present on the alert is :"+text);
		
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		/*Handling Alerts
When the Alerts are displayed, they won’t allow you to perform any other operation on the website
Practical Demonstration
UnhandledAlertException will be displayed
Same exception will be displayed if you close the browser without handling the alert.

Types of Alerts
Information Alert – hdfc netbanking
Confirmation Alert – hdfc netbanking
Prompt Alert – internet herokup


Handle Information Alerts using the Alert Interface
Practical Demonstration – internet heroku
Click on the button to display alert
We cannot inspect or perform operations on the alert by default
Switch to the displayed alert using switchTo().alert() of WebDriver interface
Read the text on the alert using getText() method of Alert interface
Accept the alert using accept() method of Alert interface
Dismiss the alert using dismiss() method of Alert interface

Perform some operation on the web page now or close the browser window.
We won’t get any UnhandledAlertException now
Waiting for an Alert using isAlertPresent()
Practical Demonstration
NoAlertPresentException
Practical Demonstration
Handling Confirmation Alerts
Practical Demonstration – Internet Heroku
Handling Prompts
Practical Demonstration – Internet Heroku
*/
		

	}

}
