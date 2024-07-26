package pack6;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyDownAndKeyUp {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://omayo.blogspot.com/");
		String parentid = driver.getWindowHandle();
		 System.out.println(parentid);
		 
		 @SuppressWarnings("unused")
		WebElement compendiumLink = driver.findElement(By.linkText("compendiumdev"));
		 
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).moveToElement(compendiumLink).click().keyUp(Keys.CONTROL).build().perform();
		

}
	
}
