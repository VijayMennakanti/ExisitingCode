package qaFoxJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashingWebElement {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
	//	JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		WebElement button = driver.findElement(By.xpath("//div[@id='cart']/button[@type='button']"));
		
	//	String defaultcolor = button.getCssValue("background-color");
		
/*		for (int i=1;i<=15;i++) {
			
			
			jse.executeScript("document.evaluate(\"//div[@id='cart']/button[@type='button']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.style.background='yellow'");
			
			Thread.sleep(50);
			
			jse.executeScript("document.evaluate(\"//div[@id='cart']/button[@type='button']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.style.background='"+defaultcolor+"'");
		} */
		
// Creating Reusable Method.		
		flashinglight(driver,button);
	}
	
	public static void flashinglight(WebDriver driver, WebElement element) throws InterruptedException {
		
		String defaultcolor = element.getCssValue("background-color");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
for (int i=1;i<=50;i++) {
			
			
			jse.executeScript("arguments[0].style.background='yellow'",element);
			
			Thread.sleep(1000);
			
			jse.executeScript("arguments[0].style.background='"+defaultcolor+"'",element);
		} 
		
		
	}
	
	
	
	
	

}
