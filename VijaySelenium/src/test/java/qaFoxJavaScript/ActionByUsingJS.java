package qaFoxJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionByUsingJS {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
	//	JavascriptExecutor jse= (JavascriptExecutor)driver;
		
	//1.click();
		
	/*	jse.executeScript("document.evaluate(\"//a[text()='Blogger']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();\r\n"
				+ ""); */
	
// 2.using click()by finding the webelement with the help of the selenium.
		
	/*	WebElement link = driver.findElement(By.xpath("//a[text()='Blogger']"));
		
		jse.executeScript("arguments[0].click()", link);*/
		
		
// 3.Reusable methods for clicking element.
		
	/*	WebElement alertButton = driver.findElement(By.xpath("//input[@id='alert1']"));
		
		jse.executeScript("arguments[0].click()", alertButton);*/
		WebElement alertButton = driver.findElement(By.xpath("//input[@id='alert1']"));
		clickMethod(driver,alertButton);
		}
	public static void clickMethod(WebDriver driver, WebElement element) {
		
		

        JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element);
	}
	
	

}
