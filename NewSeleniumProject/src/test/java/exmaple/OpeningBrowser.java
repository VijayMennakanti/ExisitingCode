package exmaple;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;

public class OpeningBrowser {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://tutorialsninja.com/demo/");
	    elementDisplayed(driver);
	

		
	}
	
	public  static void elementDisplayed(WebDriver driver) {
		
		
		 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Hp");
		    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		    
		  WebElement textlemenet = driver.findElement(By.xpath("//a[contains(text(),'HP LP3065')]"));
		    
			
		if(textlemenet.isDisplayed())	{
				
				System.out.println("Test is pass");
				
			} else{
				
				
				System.out.println("Test is failed");
			}
		
		
		
		
		
		
	}

}
