package Mary;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows1 {

	public static void main(String[] args) throws InterruptedException {
		
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://demo.automationtesting.in/Windows.html");        // Parentwindow  or Defaultwindow.
       
       
     String parentWindow = driver.getWindowHandle();
    //   driver.findElement(By.linkText("Open New Tabbed Windows ")).click();
       
      // Thread.sleep(3000);
       
   driver.findElement(By.xpath("(//button[@class='btn btn-info'][contains(text(),'click')])[1]")).click(); // child window1
       
   
   driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();   // child window2
   driver.findElement(By.xpath("//div[@id='Multiple']/button")).click();
   
   Set<String> windowIds = driver.getWindowHandles();
  Iterator<String> itr = windowIds.iterator();
 
   
  while(itr.hasNext()) {
	  
	 String win = itr.next();
	  
	  driver.switchTo().window(win);
	  
	  if(driver.getTitle().equals("Selenium")) {
		  
		  driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		  
		String text = driver.findElement(By.xpath("//a[@href='/downloads']")).getText();
		  
		System.out.println(text);
		  break;
		  
		  
	  }
	  
	  
  }
   
   driver.switchTo().window(parentWindow);
   
   
   Thread.sleep(3000);
   
  Alert alert = driver.switchTo().alert();
  
  
  alert.dismiss();
  
  Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@href='WebTable.html'][text()='WebTable']")).click();
  

	}

}
