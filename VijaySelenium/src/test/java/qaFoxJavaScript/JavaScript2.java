package qaFoxJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript2 {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      
    WebDriver driver =new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://omayo.blogspot.com/");
    
   JavascriptExecutor jse= (JavascriptExecutor) driver;
    
// WebElement ele = (WebElement) jse.executeScript("return document.evaluate(\"//p/a[text()='Open a popup window']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
    
// ele.click();
   
   
   
 
	}

}
