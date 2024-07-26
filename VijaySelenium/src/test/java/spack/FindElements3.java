package spack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> href = driver.findElements(By.xpath("//a"));

		System.out.println(href.size());
        for(WebElement hyper:href) {
        	
        	String hyperlin = hyper.getAttribute("href");
        	
        	System.out.println(hyperlin);
      
        
        }
        
        Thread.sleep(2000);
        
        driver.quit();
        
        
	}
	
	

}
