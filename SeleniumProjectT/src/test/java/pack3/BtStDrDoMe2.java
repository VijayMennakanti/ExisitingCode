package pack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtStDrDoMe2 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.browserstack.com/guide/handling-dropdown-in-selenium-without-select-class");
        
                By developersMenu = By.xpath("//button[@id='developers-dd-toggle']");
                By productMenu    =  By.xpath("//button[@id='products-dd-toggle']");
                
             //   driver.findElement(productMenu).click();
                
                selectingOptionsFomBootStrap(developersMenu, "Documentation");   
                
                
	}

	public static WebElement convertingWebElement(By field) {
		return driver.findElement(field);
		
	}
	public static void selectingOptionsFomBootStrap(By field, String value) {
		
		convertingWebElement(field).click();
		
		String xpath="//span[text()=\'"+value+"\']";
	
		convertingWebElement(By.xpath(xpath)).click();
	}
	
	
	
	
}
