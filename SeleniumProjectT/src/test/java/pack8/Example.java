package pack8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		

		    driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			
			driver.get("https://www.redbus.in/");
		    driver.findElement(By.className("labelCalendarContainer")).click();
		    WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
			myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='labelCalendarContainer']")));
		//	selectDateInCalendar("2", "June", "2025");
			 
	}

}
