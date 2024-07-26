package robotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
public class CapturingScreenShotsDimension2 {

	public static void main(String[] args) throws AWTException, IOException {
		

	     WebDriverManager.chromedriver().setup();
	     
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://tutorialsninja.com/demo/");
	   
	    Robot robot = new Robot();
	    
	   Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	   Rectangle rectangle = new Rectangle(d);
	   
	   BufferedImage srcfile = robot.createScreenCapture(rectangle);
	   
	   
	   ImageIO.write(srcfile, "PNG", new File("./vijay/dimension.png"));
	   
	   
		
	}

}
