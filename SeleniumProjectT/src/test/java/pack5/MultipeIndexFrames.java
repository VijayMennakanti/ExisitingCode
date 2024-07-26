package pack5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipeIndexFrames {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	List<WebElement> numberOfFrames = driver.findElements(By.tagName("frame"));
	
	int noFrames = numberOfFrames.size();
	int s=0;
	int index=0 ;
	String text ;
	
	
	for(int i=0;i<noFrames;i++) {
		
		driver.switchTo().frame(i);
	s	=driver.findElements(By.xpath("//body")).size();
	
	if(s>0) {
		
		index=i;
	  text=driver.findElement(By.xpath("//body")).getText();
	   System.out.println(text);
		break;
	}
		driver.switchTo().parentFrame();
	}
	
	
	
	}
}
