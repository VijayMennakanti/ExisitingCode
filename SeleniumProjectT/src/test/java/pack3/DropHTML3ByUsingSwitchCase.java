package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropHTML3ByUsingSwitchCase {
      
	 static WebDriver driver;
	
	public static void main(String[] args) {
		
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://letcode.in/dropdowns");
		  
		  
		By fruits = By.id("fruits");
	    By languages = By.id("lang");
		By country = By.id("country");
		
		selectOptionsInDrp(fruits, "visibletext", "Mango");
		selectOptionsInDrp(languages,"index","2");
		selectOptionsInDrp(country, "value","India");
		}
	
	public static WebElement getWebElement(By field) {
		return  driver.findElement(field) ;   
		}
	
	
	
	public static void selectOptionsInDrp(By field, String optionType, String optionValue) {
		          
		         Select webElement = new Select( getWebElement(field));
		         
		         switch(optionType) {
		         
		         case "visibletext":
		        	 
		        	 webElement.selectByVisibleText(optionValue);
		        	 break;
		        	 
		         case "index" :
		        	 
		        	 webElement.selectByIndex(Integer.parseInt(optionValue));
		         break;
		         
		         case "value" :
		        	 
		        	 webElement.selectByValue(optionValue);
		        	 break;
		         
		         }
		
		
		
	}
	
	
	

}
