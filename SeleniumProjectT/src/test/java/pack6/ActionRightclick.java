package pack6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightclick {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 
		WebElement rirghtClickMe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
                Actions actions = new Actions(driver);
                
                actions.contextClick(rirghtClickMe).perform();
                
       WebElement copyOption = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		
		actions.moveToElement(copyOption).click().perform();
		
	Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}

}
