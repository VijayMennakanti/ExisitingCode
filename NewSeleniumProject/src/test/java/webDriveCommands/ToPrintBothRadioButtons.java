package webDriveCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToPrintBothRadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		List<WebElement> radioButtons = driver.findElements(By.xpath("//label[@class='_58mt']"));

		/* For-each LOOP
		 * 
		 * for(WebElement radioButton : radioButtons) {
		 * 
		 * String text = radioButton.getText();
		 * 
		 * System.out.println(text); }
		 */

		/* For-LOOP
		 * radioButtons.size(); for (int i=0;i<=radioButtons.size();i++) { WebElement
		 * radio = radioButtons.get(i);
		 * 
		 * String text = radio.getText(); System.out.println(text);
		 * 
		 * }
		 */
		int index=0; // we can give int i=0;
		while (index<radioButtons.size()) {
			
		WebElement radiobutton = radioButtons.get(index);  // converting int to webelement then we can use webelement interface method i.e, getText();
		System.out.println(radiobutton.getText()); 
			
			index++;
		}
		
		
		
	}

}
