package pack6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDropImage3 {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 

		driver.switchTo().frame(iframe);
		
		WebElement img1 = driver.findElement(By.xpath("//li/img[@alt='The peaks of High Tatras']"));
		
		WebElement img2 = driver.findElement(By.xpath("//li/img[@alt='The chalet at the Green mountain lake']"));
		
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(img1, trash).dragAndDrop(img2, trash).perform();
		//actions.dragAndDrop(img2, trash).perform();
		
	}

}
