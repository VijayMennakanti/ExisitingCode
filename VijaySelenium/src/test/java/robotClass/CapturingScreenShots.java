package robotClass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenShots{

	
	public static void main(String[] args) throws AWTException, IOException {

	     WebDriverManager.chromedriver().setup();
	     
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://tutorialsninja.com/demo/");
	   
	  Robot robot = new Robot();
	  Rectangle rectangle =new Rectangle(25,50,1000,300);
	 BufferedImage srcImage = robot.createScreenCapture(rectangle);
	 
	 ImageIO.write(srcImage, "PNG", new File("./vijay/robot.png"));
	   
	   
	   
	   
	   
	  }
	
	
}
