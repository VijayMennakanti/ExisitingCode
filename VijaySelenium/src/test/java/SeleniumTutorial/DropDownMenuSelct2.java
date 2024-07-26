package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenuSelct2 {

	 static WebDriver driver;
	
	public static void main(String[] args) {
       
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formstone.it/components/dropdown/demo/");
	/*	1.APPROACH -LENGTHY
	Select stateListdrp = new Select(driver.findElement(By.id("demo_label")));
	stateListdrp.selectByVisibleText("Maryland");
	
	Select labelOptiondrp=new Select(driver.findElement(By.id("demo_native")));
	
	labelOptiondrp.selectByIndex(2); */
		
		
		// 2. Generic-Method.
	WebElement stateDrpElement = driver.findElement(By.id("demo_label"));
	SampleGenericMethod(stateDrpElement,"Texas");
		
	WebElement labelDrpElement = driver.findElement(By.id("demo_native"));
	SampleGenericMethod(labelDrpElement,"Two");
	}
	
	public static void SampleGenericMethod( WebElement ele, String value) {
		
	Select drp	= new Select(ele);
	
	List<WebElement> allOption = drp.getOptions();
		
		for(WebElement option:allOption) {
			
			if(option.getText().equals(value)) {
				
				option.click();
				
				break;
				
			}
			
		}
		 
	}
	
	}


