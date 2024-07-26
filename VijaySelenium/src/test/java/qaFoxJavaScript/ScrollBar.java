package qaFoxJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		 JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
		 
	//	 jscriprt.executeScript("window.scrollTo(0,500);"); // this method scroll the rulers untill which we mentioned in the close bracket;
	//	 jscriprt.executeScript("window.scrollBy(0,500);");// this method scroll the rulers untill down from its exisiting position.
		 
		 
		// jscriprt.executeScript("document.evaluate(\"//a[contains(text(),'Blogger')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
	
	WebElement textbox = driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
	 
	jscriprt.executeScript("arguments[0].setAttribute('style', 'border:5px blue dashed; background:lightgreen;');",textbox );
	 
	
	 }

}
