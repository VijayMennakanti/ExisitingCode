package pack7;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakingScreenShotsByUsingAshotAPI {

	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.evernote.com/shard/s433/client/snv?isnewsnv=true&noteGuid=e60891a0-52ff-4ed2-b8c7-27d0f468cee2&noteKey=f8be1dd6b8b5f9c1&sn=https%3A%2F%2Fwww.evernote.com%2Fshard%2Fs433%2Fsh%2Fe60891a0-52ff-4ed2-b8c7-27d0f468cee2%2Ff8be1dd6b8b5f9c1&title=Taking%2BScreenshots%2B-%2BPage%252C%2BWeb%2BElement%252C%2BSection%252C%2BFull%2BPage%252C%2BFileHandler%252C%2BRobot%252C%2BAShot%2Band%2BSelenium%2B4%2BChanges%2B%2528Selenium%2B4%2B-%2BSession%2B22%2529");

		 Screenshot ScreenShotofTheNote = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		
//	String destinationpath = System.getProperty("User.dir")+"//ScreenShots//fullpage.png";
		 
	File destin = new File(".//ScreenShots//sagar.png");
 
		ImageIO.write(ScreenShotofTheNote.getImage(),"PNG",destin);
		
			}

}
