package pack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDownMenu1 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/guide/handling-dropdown-in-selenium-without-select-class");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("products-dd-toggle")).click();
		
		
		List<WebElement> optionlist = driver.findElements(By.xpath("(//span[@class='item-text'][text()='For Teams'])[1]/preceding::span"));

		voidgenericMethod(optionlist, "Automate");
		
		
	/*	for(WebElement option:optionlist) {
			
			
			if(option.getText().equals("Automate")) {
				
				
				option.click();
				
				Thread.sleep(2000);
				}
		}  */
	}
	 public static void voidgenericMethod(List<WebElement>options, String value) {
		 
		 
			for(WebElement option:options) {
				
				
				if(option.getText().equals(value)) {
					
					
					option.click();
					
					break;
				
					}
			}
		 
		 
	 }
}
