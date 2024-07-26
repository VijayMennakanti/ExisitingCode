package pack10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableqafox {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/");

		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']"))).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sales')]"))).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	
		System.out.println(text);//Showing 1 to 10 of 128 (13 Pages)
		
	System.out.println(text.length());	
	
	int index = text.indexOf("(");
	
	System.out.println(index);
		String pages = text.substring(24, 26);
	
	System.out.println(pages);
	
	int pagestoInt = Integer.parseInt(pages);
	
	}

}
