package qaFoxJavaScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BorderAndFailedThingsScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		File folder = new File("vijay");
		folder.mkdir();
		
		File file = new File("vijay/pavani.txt");
		file.createNewFile();
		
	//	 JavascriptExecutor jse= (JavascriptExecutor)driver;
		 
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		 
	/*	 jse.executeScript("arguments[0].style.border='5px red dashed'", textarea);
		 
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile, new File("./jai/highlight.png"));
		 
		 jse.executeScript("arguments[0].style.border=''", textarea);*/
		takingScreenShots(driver, textarea);
	}
  // Re-usable Method
	
	public static void takingScreenShots(WebDriver driver, WebElement element) throws IOException {
		
		 JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		 jse.executeScript("arguments[0].style.border='5px red dashed'", element);
		
		 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // this two step will take the screenshots.
			
			FileHandler.copy(srcFile, new File("./vijay/highlight.png"));
			 jse.executeScript("arguments[0].style.border=''", element);
	}
	
	
}
