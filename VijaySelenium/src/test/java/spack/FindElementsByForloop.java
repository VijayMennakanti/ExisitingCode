package spack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FindElementsByForloop {

	public static void main(String[] args) {
  
    String browser="Chrome";
    WebDriver driver=null;
    if (browser.equalsIgnoreCase("Chrome")) {
    	
    	driver = new ChromeDriver();
    	 }
    else if(browser.equalsIgnoreCase("Firefox")) {
    	
    	
     driver = new FirefoxDriver();
    	
  }

    driver.manage().window().maximize();
    
    driver.get("https://omayo.blogspot.com/");
    
    List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
    
   /*for(WebElement e:links) {
    	
    	System.out.println(e.getText());*/
    
    for(int i=0;i<links.size();i++) {
    	
    	System.out.println(links.get(i).getText());
    	
    	
    }
   	
    
    
    
    
	}
	
	

}
