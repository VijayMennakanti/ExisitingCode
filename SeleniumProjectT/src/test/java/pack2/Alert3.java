package pack2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handling Prompts:

public class Alert3 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//li/a[text()='JavaScript Alerts']")).click();
		
		driver.findElement(By.xpath("//li/button[contains(text(),'Click for JS Prompt')]")).click();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnTheAlert = alert.getText();
		
		System.out.println(textOnTheAlert);
		
		alert.sendKeys("Vijay Mennakanti");
		alert.accept();
		
		String resultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(resultText);
		

	}

}
