package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logicForFrames {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     
     
     
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://docs.oracle.com/javase/8/docs/api/");
     
     driver.switchTo().frame(2);
     
     Thread.sleep(3);
     driver.findElement(By.xpath("//a[contains(text(),'Accept all')]")).click();
    
     
     
    
    
		
	}

}
