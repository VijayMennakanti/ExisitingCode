package pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Handling Bootstrap Model Dialogs:


public class Alert6 {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ux.stackexchange.com/questions/12045/what-is-a-modal-dialog-window");
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ff-sans ps-fixed z-nav-fixed ws4 sm:w-auto p32 sm:p16 bg-black-600 fc-white bar-lg b16 l16 r16 js-consent-banner']")));
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Accept all cookies')]")).click();

		driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
	}

}
