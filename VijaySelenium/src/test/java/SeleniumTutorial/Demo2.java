package SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {                              // LOGIC FOR MULTIPLE BROWSERS
  
	static String browser = "Firefox";
	static WebDriver driver= null;
	public static void main(String[] args) {
		
	//	String browser = "Firefox";
	//	WebDriver driver= null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			
		 driver = new ChromeDriver();
			
			
		} else if(browser.equalsIgnoreCase("Firefox")) {
			
			
			 driver = new FirefoxDriver();
			
		}
       
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		
	}

}
