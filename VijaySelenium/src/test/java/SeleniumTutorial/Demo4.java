package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	
	WebElement blogMenu = driver.findElement(By.xpath("//a/span[@id='blogsmenu']"));
	
	  Actions a = new Actions(driver);
	
    a.moveToElement(blogMenu).perform();
    
    
    
	}

}
