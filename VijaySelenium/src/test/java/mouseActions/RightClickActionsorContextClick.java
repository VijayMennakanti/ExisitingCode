package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickActionsorContextClick{

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	   Actions actions = new Actions(driver);
	    
	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    
	  //  driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	    
	    actions.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]")))
	    .perform();

         

	}

}
