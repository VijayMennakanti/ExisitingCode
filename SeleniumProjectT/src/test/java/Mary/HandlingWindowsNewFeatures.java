package Mary;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsNewFeatures {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");   // main window
		driver.findElement(By.id("ta1")).sendKeys("vijay");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		
	}

}
