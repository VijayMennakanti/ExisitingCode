package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]")).click();
		
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement flipkart = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Flipkart')]")));
		
		
	 flipkart.click();
          

	}

}
