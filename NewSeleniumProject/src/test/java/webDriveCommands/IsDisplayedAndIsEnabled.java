package webDriveCommands;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedAndIsEnabled {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();

		boolean button = driver.findElement(By.xpath("//button[@value='1']")).isEnabled();

		if (logo == true) {

			System.out.println("Facebook logo is Displayed and Test case is passed");

		} else {

			System.out.println("Test case is Failed");
		}

		if (button == true) {

			System.out.println("Button is enabled and the Test case is passed");
		} else {

			System.out.println("Button is disabled and the test case is failed");
		}

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		boolean radioButtonSelected = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		
		
		if (!(radioButtonSelected == true)) {
		
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			System.out.println("button is selected");

		} else {
			
			System.out.println("Button is not selected");
		}

	}
/* Notes about the methods isSelected(),isEnabled(), and isDisplayed this are the methods of the webelement interface 
 * like click();
 * sendKeys();
 * clear();
 * getText();
 * getAtrribute(); and
 * submit();
 * 
 * 
 * 
 * */
}
