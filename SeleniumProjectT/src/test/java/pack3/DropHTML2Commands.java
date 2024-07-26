package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropHTML2Commands {
	
	/*Handling HTML Drop-down fields
Select class is the predefined class in Selenium WebDriver and it has predefined methods for performing various operations on Drop-down fields
We can use the below commands:
selectByVisibleText()
selectByIndex()
selectByValue()
deselectByVisibleText() – Not applicable for dropdown fields
deselectByIndex() – Not applicable for dropdown fields
deselectByValue() – Not applicable for dropdown fields
isMultiple()
getOptions()
*/

	public static void main(String[] args) {
  
		
		ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
   driver.get("https://omayo.blogspot.com/");   
   
  WebElement drpElements = driver.findElement(By.xpath("//select[@id='drop1']"));
 
		       Select drpMenu = new Select(drpElements);
		       
		       drpMenu.selectByVisibleText("doc 3");
		       
		       drpMenu.selectByIndex(2);
		       
		       drpMenu.selectByValue("mno");
		
		    System.out.println(drpMenu.isMultiple());  
		
		   List<WebElement> options = drpMenu.getOptions();
		   
		   for(WebElement option:options) {
			   
			   System.out.println(option.getText());
			   
		   }
		   
		   
	}

}
