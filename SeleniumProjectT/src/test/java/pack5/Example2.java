package pack5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
	   
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	  
	int nuofFrames= frames.size();
	
	int s;
	int index=0;
	
	for(int i=0; i<nuofFrames;i++) {
		
		driver.switchTo().frame(i);
		
	s	=driver.findElements(By.xpath("//div[@class='iframe-container']/h5")).size();
		
		if(s>0) {
			
			index=i;
			
			String text=driver.findElement(By.xpath("//div[@class='iframe-container']/h5")).getText();
			System.out.println(text);
			
			break;
		}
		
		driver.switchTo().parentFrame();
		
	}
	
		
	}

}
