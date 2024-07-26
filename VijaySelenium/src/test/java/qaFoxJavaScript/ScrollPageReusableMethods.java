package qaFoxJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPageReusableMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='button'][text()=' LogIn ']"));
		
	  //  JavascriptExecutor jse=(JavascriptExecutor) driver;
	//    jse.executeScript("arguments[0].scrollIntoView()",loginButton);
		//scrollIntoview(driver, loginButton);
	//	scrollToEndOfthePage(driver);
		String text = retrieveEntireTextOnthePage(driver);
		System.out.println(text);
	    }
	
	public static void scrollIntoview(WebDriver driver, WebElement element) {
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		    jse.executeScript("arguments[0].scrollIntoView()", element);
		
		
	}
              public static void scrollToEndOfthePage(WebDriver driver) {
            	  
            	  JavascriptExecutor jse=(JavascriptExecutor) driver;
      		    jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            	  
              }
       public static String retrieveEntireTextOnthePage(WebDriver driver) {
    	   
    	   JavascriptExecutor jse=(JavascriptExecutor) driver;
    	 String innerText = jse.executeScript("return document.documentElement.innerText").toString();
    	 
    	 return innerText;
    	 
    	   
       }        
              
              
              
              
}
