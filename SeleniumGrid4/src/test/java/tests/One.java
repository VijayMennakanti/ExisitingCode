package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base{
	
	public WebDriver driver;
	
  @Test
	public void testone() {
		
	  driver.manage().window().maximize();
	
		driver.get("https://omayo.blogspot.com/");
		
		String tilte = driver.getTitle();
		
		System.out.println(tilte+"from Chrome");
	}
  @BeforeMethod
  public void setup() throws MalformedURLException {
	  
	 driver = intilizingBrower("chrome");
  }
  
  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
	  
	  
  }
}
