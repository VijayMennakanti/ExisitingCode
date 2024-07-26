package robotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPageMethods {

	public static void main(String[] args) throws AWTException {

	     WebDriverManager.chromedriver().setup();
	     
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://tutorialsninja.com/demo/");
	   
	    Robot robot = new Robot();
	    
	    robot.mouseWheel(15);
	    
	    robot.delay(2000);
	    
	    robot.mouseWheel(-8);
	    
	    
	}

}
