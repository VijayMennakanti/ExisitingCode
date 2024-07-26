package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*pageLoadTimeout and TimeoutException – Selenium Exception Type
By default Selenium WebDriver waits indefinitely, until the page to load without any time limit
But we can set time limit for the web page to load using pageLoadTimeout()
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(x))
If the page doesn’t load in the specified time, we will get TimeoutException
Practical Demonstration
Omayo website page takes 4 seconds to load
But if we set the limit to 2 seconds to load using pageLoadTimeout(), we get this TimeoutException
*/
public class Synchronization5 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("vijay mennakanti");
        
		driver.quit();

	}

}
