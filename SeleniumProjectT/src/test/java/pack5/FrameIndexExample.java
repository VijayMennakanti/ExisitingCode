package pack5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIndexExample {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	  
	int nuofFrames= frames.size();
	
	int s;
	int index;
	
	for (int i=0;i<nuofFrames;i++) {
		
		driver.switchTo().frame(i);
		
		s=driver.findElements(By.xpath("//input[@type='text']")).size();
		
		if(s>0) {
			
			index=i;
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");
			
			break;
		}
		
		driver.switchTo().parentFrame();
		
	}
	 
	// driver.switchTo().frame(index);
	 
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
	// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");

	}

}
