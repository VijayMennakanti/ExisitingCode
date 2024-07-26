package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	
	public WebDriver intilizingBrower(String browserName) throws MalformedURLException {
		
		WebDriver driver;
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		if (browserName.equals("chrome")) {
			
			dc.setBrowserName("chrome");
		}else if (browserName.equals("firefox")) {
			
			dc.setBrowserName("firefox");
		}else if (browserName.equals("safari")) {
			
			dc.setBrowserName("safari");
		}else if (browserName.equals("edge")) {
			
			dc.setBrowserName("MicrosoftEdge");
		}else if (browserName.equals("ie")) {
			
			dc.setBrowserName("internet explorer");
		}else if (browserName.equals("opera")) {
			
			dc.setBrowserName("opera");
		}
		
		driver= new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		
		return driver;
	}

}
