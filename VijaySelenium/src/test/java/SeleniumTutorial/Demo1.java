package SeleniumTutorial;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // Launching browsers by uing the WebDriverManager
 
    ChromeDriver driver = new ChromeDriver();
	
   // WebDriverManager.firefoxdriver().setup();  // we can launch any browser
  //FirefoxDriver driver = new FirefoxDriver();
  
    driver.manage().window().maximize();
    
    driver.get("https://mvnrepository.com/");
    
  String title = driver.getTitle();
    System.out.println(title);
    
  String url = driver.getCurrentUrl();
    
  System.out.println(url);
  
  driver.quit();
	}

}
