package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("https://letcode.in/frame");
			
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("vijay");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Mennakanti");
		
		WebElement childiframeone = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(childiframeone);
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijaymennakanti1@gmail.com");
		
		
	}

}
