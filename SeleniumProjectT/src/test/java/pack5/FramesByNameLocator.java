package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesByNameLocator {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
	//driver.switchTo().frame("pop-frame04189016243242749");
	//	driver.findElement(By.xpath("//a[@class='call']")).click();
	driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Accept all']")).click();
		
	//	driver.findElement(By.xpath("//a[normalize-space()='Description']")).click();
		
		

	}

}
