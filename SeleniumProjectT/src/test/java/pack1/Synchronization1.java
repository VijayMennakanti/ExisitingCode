package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Waiting for an Element to be displayed on the page
 * Sometimes, UI element won’t be displayed on the page immediately and make take time to display after performing an action
As Selenium WebDriver cannot wait for the UI element, we have to explicitly wait until the UI element is displayed on the page.
*/

public class Synchronization1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement gmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myDropdown']/a[text()='Gmail']")));
		gmail.click();
		
	}

}
