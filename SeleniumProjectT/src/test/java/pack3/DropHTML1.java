package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropHTML1 {

	public static void main(String[] args) {
	
                 ChromeDriver driver = new ChromeDriver();
                 
                 driver.manage().window().maximize();
                 
            driver.get("https://omayo.blogspot.com/");   
            
           WebElement drpElements = driver.findElement(By.xpath("//select[@id='drop1']"));
           genericMethod(drpElements,"doc 4");
            
    /*    Select drpMenu = new Select(drpElements);
        
       List<WebElement> options = drpMenu.getOptions();
        
          System.out.println(options.size());  
         
        for(WebElement option:options ) {
        	
        	
        	if(option.getText().equals("doc 3")) {
        		
        		
        		option.click();
        		break;
        	}
        }  */
          
          
	}
	
	public static void genericMethod(WebElement ele, String value) {
		
		
		  Select drp = new Select(ele);
		  
		 List<WebElement> options = drp.getOptions();
		 
		 for(WebElement option:options) {
			 
			 if(option.getText().equals(value)) {
				 
				 option.click();
				 
			 }
			 
			 
			 
			 
			 
		 }
		 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
