package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeysPause {

	public static void main(String[] args) {
		
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vijay");
		 
		 Actions actions = new Actions(driver);
		 
		 
		 actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys("mennakanti")
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys("vijaymennakanti034@gmail.com")
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys("1677188199")
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys("vijai@034")
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys("vijai@034")
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.SPACE)
		 .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER)
		 .build().perform();
		 
	
		

	}

}
