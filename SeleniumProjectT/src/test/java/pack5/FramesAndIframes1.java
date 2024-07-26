package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndIframes1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/iframe");
//	1.	By Using the Name and Id
		driver.switchTo().frame("mce_0_ifr");
	//	driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
	WebElement frameContainText = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		frameContainText.clear();
		frameContainText.sendKeys("vijay mennakanti");

	}

}
