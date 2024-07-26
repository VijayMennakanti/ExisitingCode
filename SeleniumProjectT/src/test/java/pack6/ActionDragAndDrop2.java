package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop2 {

	public static void main(String[] args) {
	
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		 
		 
		WebElement washintonBox = driver.findElement(By.id("box3"));
		
		WebElement UnitedstatesBox = driver.findElement(By.id("box103"));
		
		Actions actions = new Actions(driver);
		 
	//	actions.dragAndDrop(washintonBox, UnitedstatesBox).perform();  1.method
	
		actions.clickAndHold(washintonBox).moveToElement(UnitedstatesBox).release().build().perform();//2.method

	}

}
