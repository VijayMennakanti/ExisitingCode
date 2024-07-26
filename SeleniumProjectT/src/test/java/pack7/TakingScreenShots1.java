package pack7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//1.ScreenShot-Fullpage.
 
public class TakingScreenShots1 {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver   driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		
		File targetFile = new File("./ScreenShots/demo.png");
		
// 1. Selenium introduced a predefind method FileHandler.copy(), we can use this method instead of the FileUtils.
		
// 2. we have to create a Folder for the FileHandler.copy() method.
		
	//	FileUtils.copyFile(srcFile, targetFile);
		
		FileHandler.copy(srcFile, targetFile);
		
		driver.findElement(By.linkText("Books")).click();
		
		File src2 = driver.getScreenshotAs(OutputType.FILE);
		
		File target2 = new File("./ScreenShots/vijay.png");
	
	FileHandler.copy(src2, target2);
		
	//	FileUtils.copyFile(src2, target2);
		
	
	}

}
