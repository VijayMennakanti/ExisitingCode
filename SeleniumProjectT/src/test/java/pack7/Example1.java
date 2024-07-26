package pack7;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Example1 {

	public static void main(String[] args) throws IOException {
		ChromeDriver   driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
	
	//String destination = System.getProperty("user.dir")+"/ScreenShots/fullscreenshot.png";
		
		File destination = new File(".//ScreenShots//Annie.png");
		
		
		ImageIO.write(screenshot.getImage(),"PNG",destination);



	}

}
