package webDriveCommands;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");//  navigate().to---> navigates to URL which you provide
		Thread.sleep(1000);
		
		driver.navigate().back();//  navigate().back------> navigates back from the  current page.
		Thread.sleep(1000);
		
		
		driver.navigate().forward(); // navigate().forward--------> navigates forward to the current page. 
		Thread.sleep(1000);
		
		
		driver.navigate().refresh(); // navigate().refresh-----> refresh the current page.
		
	//navigation() is a method and not a interface it's a method of the Webdriver interface in Selenium Webdriver for java.
		
/* The navigate() provides navigation-related functionalities such as
 * 1.to(String url)
 * 2.back()
 * 3.forwared()
 * 4.refresh()
 * */
		
		driver.quit();
		 
	       
		
		
		
	}

}
