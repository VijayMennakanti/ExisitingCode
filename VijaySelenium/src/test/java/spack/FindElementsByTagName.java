package spack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByTagName {
	public static void main(String[] args) {
		
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://demo.nopcommerce.com/");
         
      List<WebElement> anchoreTags = driver.findElements(By.tagName("a"));
         
         System.out.println(anchoreTags.size());
       /*  for(int i=0;i<anchoreTags.size();i++) {
        	 
        	if(anchoreTags.get(i).getText().length()>0) {
        		
        		
        		System.out.println(anchoreTags.get(i).getText()); 
        		
        	} 
          } */
         // For-each loop using
         
         for(WebElement e:anchoreTags) {
        	 
        	 
              if(e.getText().length()>0) {
            	  
            	  
            	  
            	  System.out.println(e.getText());
              }
       
        	
        }

       
        	
     
        
        	 
         }
         
         
         
	}


