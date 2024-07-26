package pack7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShots {

	public static void main(String[] args) {
		
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://omayo.blogspot.com/");
		  
		   File srcfile = driver.getScreenshotAs(OutputType.FILE);
		 File destination = new File("./ScreenShots/omyo.png");
		   
		   try {
			FileUtils.copyFile(srcfile,destination );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
