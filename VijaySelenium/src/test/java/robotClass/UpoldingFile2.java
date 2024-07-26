package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpoldingFile2 {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
	     
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://the-internet.herokuapp.com/upload");
		   
		  Robot robot = new Robot();
		  
		  WebElement filebutton = driver.findElement(By.id("file-upload"));
		  Actions action= new Actions(driver);                                //if unable to perform click() we can use action class
		  action.moveToElement(filebutton).click().build().perform();
		  
		  robot.delay(2000);
		 
		  StringSelection stringselection= new StringSelection("C:\\Users\\vijay\\Downloads\\Amazon invoice 3 (1).2"); // use to copy the folder.
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		  
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		  
		  robot.delay(1000);
		  
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		  
	}

}
