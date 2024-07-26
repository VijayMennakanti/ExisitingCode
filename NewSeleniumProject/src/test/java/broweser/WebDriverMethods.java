package broweser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {
	static WebDriver driver;
	static String browserName;
	// WebDriver driver;

	public void differentBrowserLaunching(WebDriver driver, String browsername) {

		if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

			System.out.println("Chrome gets opened");

		} else if (browserName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

			System.out.println("Firefox gets opened");
		} else if (browserName.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();

			System.out.println("Edge gets oprned");

		} else {

			System.out.println("no browser gets opened");

		}

	}

	public void webDriverMethods(WebDriver driver) {

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		String title = driver.getTitle();

		System.out.println(title);
	//	String pageSource = driver.getPageSource();
	//	System.out.println(pageSource);
		
		String currentUrl = driver.getCurrentUrl();

	    System.out.println(currentUrl);
	    
	   }
	public void someMoreMethods(WebDriver driver) {
		
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
	//	Dimension d = new Dimension(500, 500);
		
	//	driver.manage().window().setSize(d);
		
//		driver.manage().deleteAllCookies(); To delete all the cookies present in the webpage.
		
		Point p = new Point(250,250);
		
		driver.manage().window().setPosition(p);
		
		
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
