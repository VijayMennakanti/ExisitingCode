package robotClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingPopup {

	public static void main(String[] args) throws AWTException {

      WebDriverManager.chromedriver().setup();
      
     WebDriver driver =new ChromeDriver();
     
     driver.manage().window().maximize();
     driver.get("https://the-internet.herokuapp.com/");
     
   WebElement link = driver.findElement(By.xpath("//a[@href=\"/download_secure\"]"));
   
   link.click();
   
         Robot robot = new Robot();
         
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot .delay(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot .delay(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
      //  robot .delay(2000);
        
   //     robot.keyPress(KeyEvent.VK_TAB);
   //     robot.keyRelease(KeyEvent.VK_TAB);
        
        robot .delay(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
      String text = driver.findElement(By.xpath("//body[contains(text(),'Not authorized')]")).getText();
   
      System.out.println(text);
      
      if(text.contentEquals(text)) {
    	  
    	  System.out.println("Test is pass");
    	  
      } else {
    	  
    	  System.out.println("Test is failed");
      }

	}

}
