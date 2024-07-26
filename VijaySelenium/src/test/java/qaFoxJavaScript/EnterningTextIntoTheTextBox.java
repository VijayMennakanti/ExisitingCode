package qaFoxJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterningTextIntoTheTextBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@name='q'][1]"));
	
	WebElement dateEnter = driver.findElement(By.xpath("//input[@name='textboxn']"));
	
	// JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
//	String text = jscriprt.executeScript(" return document.getElementById('ta1').value='vijay';").toString();
	
	String text = enteringText(driver);
	System.out.println(text);
	
	entringTextBySeleniumWebElement(driver, searchBox, "pavani");
	enteringDateInCalendar(driver,dateEnter,"12/7/09");
	}
   
	public static String enteringText(WebDriver driver) {
		
		
		JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
        String text = jscriprt.executeScript(" return document.getElementById('ta1').value='vijay';").toString();
		
        return text;
		
	}
	
	public static void entringTextBySeleniumWebElement(WebDriver driver,WebElement element,String textEnter) {
		
		JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
		
		jscriprt.executeScript("arguments[0].value='"+textEnter+"'",element);
		
	}
	
	public static void enteringDateInCalendar(WebDriver driver,WebElement element,String textEnter) {
		
JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
		
		jscriprt.executeScript("arguments[0].value='"+textEnter+"'",element);
	}
	

}
