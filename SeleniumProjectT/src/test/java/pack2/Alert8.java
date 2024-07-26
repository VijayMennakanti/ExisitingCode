package pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Handling Accept all cookies dialog:


public class Alert8 {

	public static void main(String[] args) {

		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.cookiebot.com/en/uk-ie-cookie-compliance/?utm_source=google&utm_medium=cpc&utm_term=cookies%20website&utm_campaign=cb_dm_ca_all_generic_search_prf_lead_n_ca&utm_content=ca-eng-cookies-website&campaign_id=1335393003&adset_id=53775176592&ad_id=596907546201&matchtype=p&utm_device=c&gclid=CjwKCAiAjfyqBhAsEiwA-UdzJN0FHen8EXNEpDsG6rhUuB6ZWAJIeeT8KpyMHEXy0BX-C6mBV160gxoCDG4QAvD_BwE");

		  WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
 myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CybotCookiebotDialogContentWrapper']")));
	
	
// driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
	
	}
	

}
