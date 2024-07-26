package pack7;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotUsingRobotClasswithAlert {

	public static void main(String[] args) throws AWTException, IOException {
		ChromeDriver   driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click();
		
		Robot robot = new Robot();
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle = new Rectangle(dimension);
		
		BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
		
		File destination = new File("./ScreenShots/pavani.png");
		
		ImageIO.write(bufferedImage, "png", destination);
		
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

	}

}
