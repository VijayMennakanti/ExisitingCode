package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionclassAndMethods1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement BlogMenu = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		
		
	          Actions actions = new Actions(driver);
	          
	          actions.moveToElement(BlogMenu).perform();
	          
	        WebElement option2 = driver.findElement(By.xpath("//span[contains(text(),'SeleniumByArun')]"));
	        
	      //  actions.moveToElement(option2).perform();
	     //   actions.click().perform();
	        
 // 1. if more than one predifind methods in the actions class  then we should add the "build.perform" at the end of the line.    

	 actions.moveToElement(option2).click() .build().perform()  ;
	 
	        
	        
	        
	}

}
