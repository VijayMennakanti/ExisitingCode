package pack4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsQAT {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");   // main window
		
		String orginalWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Blogger']")).click(); // child window
		
		
		Set<String> windowIDS = driver.getWindowHandles();
		
		String text= null;
		for(String windowid:windowIDS) {
			
			driver.switchTo().window(windowid);
			
			String windowpageTitle = driver.getTitle();
			
			if(windowpageTitle.equals("Blogger.com - Create a unique and beautiful blog easily.")) {
				
				 text = driver.findElement(By.xpath("((//div[@class='background'])[4]/preceding::p)[5]")).getText();
				
			//	System.out.println(text);
				
			}
			
			
			
		}
		System.out.println(text);
		
		driver.switchTo().window(orginalWindow);
		
	}

}
