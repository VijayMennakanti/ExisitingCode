package qaFoxJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightBorderAndBackground {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		 JavascriptExecutor jscriprt= (JavascriptExecutor)driver;
		 
		 jscriprt.executeScript("document.getElementById('ta1').style.border='5px red solid';");
		 
		 Thread.sleep(3000);
		 
		 jscriprt.executeScript("document.getElementById('ta1').style.background='yellow';");
		 jscriprt.executeScript("document.getElementById('ta1').setAttribute('style', 'border:5px blue dashed; background:lightgreen;');\r\n"
		 		+ "");
	}

}
