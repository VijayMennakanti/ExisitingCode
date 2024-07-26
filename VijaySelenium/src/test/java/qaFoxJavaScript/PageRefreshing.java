package qaFoxJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageRefreshing {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	refreshingPage(driver);
	
  //    JavascriptExecutor jse= (JavascriptExecutor) driver;
	
	//  jse.executeScript("history.go(0)");
	}
   
	public static void refreshingPage(WebDriver driver) {
		
		 JavascriptExecutor jse= (JavascriptExecutor) driver;
			
		  jse.executeScript("history.go(0)");
		
	}
}
