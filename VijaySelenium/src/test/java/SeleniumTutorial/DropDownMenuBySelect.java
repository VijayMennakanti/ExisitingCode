package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenuBySelect {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
	
		WebElement drpCountryElements = driver.findElement(By.id("Form_getForm_Country"));

		
		
		Select drpCountry = new Select(drpCountryElements);
		
		//drpCountry.selectByVisibleText("Australia");
		//drpCountry.selectByValue("Algeria");//  Barbados
		//drpCountry.selectByIndex(20);   // Belarus */
		
		
		//2. Selecting options without using methods by using logic.
		
		List<WebElement> options = drpCountry.getOptions();
		
		for (WebElement option:options) {
			
			if(option.getText().equals("Germany")) {
				
			option.click();
			break;
			}
		}
		
	}

}
