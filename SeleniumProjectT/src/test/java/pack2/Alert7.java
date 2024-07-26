package pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// Handling Lightbox:

public class Alert7 {

	public static void main(String[] args) {
		
		       ChromeDriver driver = new ChromeDriver();
		       
		       driver.manage().window().maximize();
		       
		       driver.get("https://tutorialsninja.com/demo/");
		       
		       driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
		       
		       driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-default btn-lg']")).click();
		  
		        driver.findElement(By.xpath("//h4/a[text()='HP LP3065']")).click();
		        
		        driver.findElement(By.xpath("(//a[@title='HP LP3065'])[1]")).click();
		        
		      WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10) );
		      myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Close (Esc)']"))).click();
		      
		      
		        
		    //    driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
	}

}
