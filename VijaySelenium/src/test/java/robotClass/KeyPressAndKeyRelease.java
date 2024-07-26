package robotClass;

import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyPressAndKeyRelease {

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
     
   WebDriver driver= new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://tutorialsninja.com/demo/");
   
   driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
   
  try {
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	
}
   
   
   
	}

}
