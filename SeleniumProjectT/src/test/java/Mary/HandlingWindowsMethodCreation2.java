package Mary;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowsMethodCreation2 {

	
	static WebDriver driver= null;
	static Set<String> windowIds;
	static String parentWindow;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		   driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.automationtesting.in/Windows.html");        // Parentwindow  or Defaultwindow.
	       
	       
	      parentWindow = driver.getWindowHandle();
	   driver.findElement(By.xpath("(//button[@class='btn btn-info'][contains(text(),'click')])[1]")).click(); // child window1
	       
	   
	   driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();   // child window2
	   driver.findElement(By.xpath("//div[@id='Multiple']/button")).click();
	   
	   windowIds = driver.getWindowHandles();
	
	   switchToTheRequioredWindow("Selenium");
	   
	   driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		  
		String text = driver.findElement(By.xpath("//a[@href='/downloads']")).getText();
		  
		System.out.println(text);
		  
		  
	}
		  
	  
    
	  public static void switchToTheRequioredWindow(String title) {
		  
		  Iterator<String> itr = windowIds.iterator();
			 
		   
		  while(itr.hasNext()) {
			  
			 String win = itr.next();
			  
			  driver.switchTo().window(win);
			  
			  if(driver.getTitle().equals(title)) {
				  
				 break;
				  
				  
			  }
			  
			  
		  }
	    
	  }
	}


