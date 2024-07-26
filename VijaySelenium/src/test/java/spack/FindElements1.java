package spack;

import java.time.Duration;
import java.util.List;
                                      // PRINTING THE ALL THE OPTIONS OF MULTI-SELECTION BOX.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
	List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		
	for(WebElement opt:options) {
		
		String optionsText = opt.getText();
		
		
		System.out.println(optionsText);
		
	}
		
		
		driver.quit();
		
	}

}
