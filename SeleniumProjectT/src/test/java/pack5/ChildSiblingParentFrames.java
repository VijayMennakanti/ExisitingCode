package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildSiblingParentFrames {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top"); // parentframe
		
		driver.switchTo().frame("frame-left");// childframe
		
	String text = driver.findElement(By.xpath("//body")).getText();
		
		System.out.println(text);
		
		driver.switchTo().parentFrame();  // switch to the parentframe
		
		driver.switchTo().frame("frame-middle"); // childframe 2
		
		String textmiddel = driver.findElement(By.xpath("//div[@id='content']")).getText();
		
		System.out.println(textmiddel);
		
		
		driver.switchTo().defaultContent(); // switch to the main web-page
		
		
		driver.switchTo().frame("frame-bottom");// switch to the bottom frame
		
		String textbottom = driver.findElement(By.xpath("//body")).getText();
		
		
		System.out.println(textbottom);
		
		
		

		
		
		
		
			

	}

}
