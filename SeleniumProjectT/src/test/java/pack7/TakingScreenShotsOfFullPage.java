package pack7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotsOfFullPage {

	public static void main(String[] args) throws IOException {

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://omayo.blogspot.com/");
		  
		File srcFile = driver.getFullPageScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile, new File("./ScreenShots/full.png"));
		  
	}

}
