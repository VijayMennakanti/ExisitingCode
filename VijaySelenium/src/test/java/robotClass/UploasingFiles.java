package robotClass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploasingFiles {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
	     
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://the-internet.herokuapp.com/upload");
		   
	  Robot robot = new Robot();
		   
		//   JavascriptExecutor jse= (JavascriptExecutor)driver;
		   
	   String path=System.getProperty("user.dir")+"\\vijay\\robot.png";
		   
		 StringSelection stringselection = new StringSelection(path); 
		   
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null); 
		   
		 WebElement filebutton = driver.findElement(By.id("file-upload"));
		 
		//jse.executeScript("document.getElementById('file-upload').click();\r\n"
		//	+ "");
		   
		 Actions action= new Actions(driver);
		 action.moveToElement(filebutton).click().build().perform();
		 
		 
		   robot.delay(2000);
		  
		   
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_V);
		    
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyRelease(KeyEvent.VK_V);
		   
		   
		   
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
