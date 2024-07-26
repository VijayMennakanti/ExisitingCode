package pack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGoogle1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
	    driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	    
	  WebElement fromMenu = driver.findElement(By.xpath("//div[@role='combobox']/input"));
	  
	  fromMenu.sendKeys("bang");
	  
	  for (int i=1; i<=4; i++) {
		  
		  Thread.sleep(2000);
		  fromMenu.sendKeys(Keys.ARROW_DOWN);
	  }
	  
	  fromMenu.sendKeys(Keys.ENTER);
		
	}

}
