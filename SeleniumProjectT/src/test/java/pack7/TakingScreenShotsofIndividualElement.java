package pack7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotsofIndividualElement {

	public static void main(String[] args) throws IOException {
		
		
        ChromeDriver   driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement MultiSelctionBox = driver.findElement(By.id("multiselect1"));
		

		File srcFile = MultiSelctionBox.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile,  new File("./ScreenShots/multi.png"));

	}

}
