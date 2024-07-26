package qaFoxJavaScript;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TogetTitleOfThePage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/");
		
	/*    JavascriptExecutor jse= (JavascriptExecutor) driver;
	    
	  String titleofThePage = jse.executeScript(" return document.title").toString(); */
	  
	    String titleofThePage = getTitleMethod(driver);
	    
	  System.out.println(titleofThePage);
	  
	  String urlOfThePage = urlOfThePage(driver);
	  
	  System.out.println(urlOfThePage);
	}
// Reusable and generic Methods
	
	public  static String getTitleMethod(WebDriver driver) {
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
	    
		  String titleofThePage = jse.executeScript(" return document.title").toString();
		
		return titleofThePage;
		
	}
	
	public static String urlOfThePage(WebDriver driver) {
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
	    
		  String urlOfThePage = jse.executeScript(" return document.URL").toString();
		
		return urlOfThePage;
		
	}
	
}
