package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization4 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
	// 1.By visibilityofElementLocated(By.locator)
		
	//	WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	WebElement hello = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		
	//	String helloText = hello.getText();
	//	System.out.println(helloText);
		
	//2. By invisibilityofElementLocated(By.locator)	
		
	/*	WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		myWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']/img")));
		
		String text = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		System.out.println(text);     */
	
    //3. Logic Writing for the Loading
		
			WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		   List<WebElement> processImage = driver.findElements(By.xpath("//div[@id='loading']/img"));
		
		int count=0;
		
		while(processImage.size()!=0 && count<=10) {
			
			Thread.sleep(1000);
			count++;
			
		}
		
		String text = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		System.out.println(text); 
		
		driver.quit();
		
		}
/*Loading Process Icon and How to Wait for the required UI element on the web page
We get an Exception when we try to perform operation element, which is not displayed due to the loading icon
In this case, if we wait for the required UI element, things may or may not work
Instead, we have to wait for the loading icon to disappear by writing some programming logic
*/
}
