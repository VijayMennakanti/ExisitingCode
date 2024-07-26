package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionResizingUsingDragandDropMethod {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://jqueryui.com/resizable/");
		 
		WebElement Resizing = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(Resizing);
		
		Actions actions = new Actions(driver);
		
	WebElement resizableOption = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	
	
	//Actions actions = new Actions(driver);
		  
		  actions.dragAndDropBy(resizableOption, 120, 150).perform();
		
	}

}
