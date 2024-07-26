package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClick {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://omayo.blogspot.com/");
		 
		WebElement Doubleclick = driver.findElement(By.xpath("//p[@id='testdoubleclick']"));
		
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(Doubleclick).perform();
		

	}

}
