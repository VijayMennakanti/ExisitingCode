package mouseActions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseOverorMovetoElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://testsigma.com/blog/mouse-hover-in-selenium/");
	    
	 
	   Actions actions = new Actions(driver);
	   
	   actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Resources ')]")))
	   .moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Tutorials')]")))
	   .click()                 // parent 
	   .perform();
	   
	  String orginal = driver.getWindowHandle();
	  
	   driver.switchTo().window(orginal);
	   driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("vijay");
	   
	   actions.doubleClick(driver.findElement(By.xpath("(//input[@type='search'])[2]")))
	   .perform();
	   
	   
	   

	}

}
