package pack8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerByVijay1Doubt {

	public static void main(String[] args) throws InterruptedException {
	   
		String month="December 2023";
		String Day= "10";
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phptravels.net/");

		driver.findElement(By.xpath("//button[@id='cookie_stop']")).click();
		
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='depart'])[1]"))).click();
		
	
	//	driver.findElement(By.xpath("//div[@class='row g-2 show active']//input[@id='departure']")).click();

		Thread.sleep(3000);
		
		while(true) {
			
			String text = driver.findElement(By.xpath("(//th[@class='switch'][contains(text(),'December 2023')])[3]")).getText();
			
			
			if(text.equals(month)) {
				
				
				break;
			}else {
				
				
				driver.findElement(By.xpath("//body/div[11]/div[1]/table[1]/thead[1]/tr[1]/th[3]//*[name()='svg']")).click();
			}
			
			
		}
	}

}
