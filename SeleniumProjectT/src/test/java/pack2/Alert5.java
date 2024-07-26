package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Handling Application Web Push Notifications (Permission Pop-ups)
ChromeOptions options = new ChromeOptions();
options.addArguments(“–disable-notifications”);
*/


public class Alert5 {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://useinsider.com/what-is-web-push-notification/");
		
		driver.findElement(By.xpath("//a[@id='wt-cli-accept-all-btn']")).click();

	}

}
