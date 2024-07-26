package pack2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
 
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		myWait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
	//	alert.accept();
		alert.dismiss();
		
		driver.findElement(By.id("ta1")).sendKeys("vijay Mennakanti");
		driver.quit();
		
		
		
			}

}
