package pack10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTables1
{

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> tableElements = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		
		tableElements.size();
		
//		for (WebElement ele:tableElements) {
			
	//	String tableElementText = ele.getText();
		
	//	System.out.println(tableElementText);
			
			
	//	}

		for (int i=0;i<tableElements.size();i++) {
			
			
			System.out.println(tableElements.get(i).getText()); 
			
		}
	}

}
