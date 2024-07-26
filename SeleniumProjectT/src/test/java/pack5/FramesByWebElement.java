package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesByWebElement {

	public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		
    WebElement frameOne = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
    
    driver.switchTo().frame(frameOne);
    
    driver.findElement(By.linkText("Home")).click();
	
	}

}
