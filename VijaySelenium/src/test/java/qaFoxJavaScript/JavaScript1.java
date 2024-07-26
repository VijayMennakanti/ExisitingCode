package qaFoxJavaScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaScript1 {

	static  WebDriver driver;
	 
	static String browser="Firefox";
	
	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
	//    driver=new ChromeDriver();
	
	    switch (browser) {
	    
	    case "Chrome":
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	break;
	    
	    case "Firefox":
	    	WebDriverManager.firefoxdriver().setup();
	    	
	    	driver = new FirefoxDriver();
	    	break;
	    	
	    	default :
	    		break;
	    	
	    	
	    }
	
	    driver.manage().window().maximize();

	}

}
