package pack3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery1 {

	public static void main(String[] args) {
    
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		SelectOptionsFromTheMenu(driver, "choice 3 ","choice 2");
		
		

	}

	public static void SelectOptionsFromTheMenu(WebDriver driver, String...value) {
		
		
List<WebElement> AllOptionsList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		
		if(!value[0].equalsIgnoreCase("all")) {
			
			for(WebElement option:AllOptionsList) {
				
				String text=option.getText();
				for(String val:value) {
					
					if(text.equals(val)) {
						
						option.click();
						 break;
					}
					
					
				}
				
			}
			
			
			
		} else {
			
			for(WebElement option:AllOptionsList) {
				
				option.click();
				
			}
			
		}
		
		
	}
	
	
	
	
	
	
}
