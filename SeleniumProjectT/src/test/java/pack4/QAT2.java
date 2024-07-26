package pack4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAT2 {

	public static void main(String[] args) {
 
	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");   // main window
		
		String orginalWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Blogger']")).click(); // child window
		
		
		Set<String> windowIDS = driver.getWindowHandles();
		
		for(String windowid:windowIDS) {
			
			driver.switchTo().window(windowid);
			
			if(!windowid.equals(orginalWindow)) {
				
				String Title = driver.getTitle();
				System.out.println(Title);
				
			}
			
			
		}
		
		driver.switchTo().window(orginalWindow);
		driver.findElement(By.id("ta1")).sendKeys("vijay mennakanti");
		
	}

}
