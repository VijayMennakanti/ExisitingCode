package pack10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTablesQaFox2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']"))).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sales')]"))).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
		
		
		
		String eCustomer="2424";
		List<WebElement> Customer = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[2]"));
		
		System.out.println(Customer.size());
		for(int i=0;i<Customer.size(); i++) {
			
			if(Customer.get(i).getText().equals(eCustomer)) {
				
				
				String xpathText="//table[@class='table table-bordered table-hover']//tbody//tr["+(i+1)+"]//td[1]";
				
				WebDriverWait vWait=new WebDriverWait(driver,Duration.ofSeconds(10) );
				vWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathText))).click();
				
				
				
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
