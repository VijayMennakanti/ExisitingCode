package pack7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotsOfParticularSection {

	public static void main(String[] args) throws IOException {
   
ChromeDriver   driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		WebElement loginPage = driver.findElement(By.xpath("//div[@id='content']"));
		
		File srcFile = loginPage.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile, new File("./ScreenShots/Register.png"));
		

	}

}
