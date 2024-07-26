package spack;

import java.time.Duration;
import java.util.List;    // PRINTING THE ALL THE LINKS AT A TIME.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                        
public class FindElements2 {

	public static void main(String[] args) throws InterruptedException {
 
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> link = driver.findElements(By.xpath("(//div[@id='HTML23']/preceding::ul)[4]/li/a"));
		
		for(WebElement links:link) {
			
			String textlinks = links.getText();
			
			System.out.println(textlinks);
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	
	
}
