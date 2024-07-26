package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClickingOptions {

	public static void main(String[] args) throws AWTException {

		
		WebDriverManager.chromedriver().setup();
	     
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://omayo.blogspot.com/");
		   
		 Robot robot = new Robot();
		 robot.mouseMove(200, 200);  // it perform the  mosuehover action.
		 
	//	 robot.mousePress(InputEvent.BUTTON2_DOWN_MASK); - used for left mouse-click.
	//	 robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		 
		 
		
		// robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); - used for right mouse-click.
	   //	 robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		 
		 
		 


	}

}
