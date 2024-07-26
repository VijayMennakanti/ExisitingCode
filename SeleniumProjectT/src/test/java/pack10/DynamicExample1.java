package pack10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicExample1 {

	public static void main(String[] args) {
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
		
		
	// 1.Total_Numberof pages in the Table:	
		
		String labelText = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	
		System.out.println(labelText);//Showing 1 to 10 of 128 (13 Pages)
		
		
		int sIndex = labelText.indexOf("(")+1;
		int eIndex = labelText.indexOf("Pages")-1;
	    String pageCountText = labelText.substring(sIndex, eIndex);
	    
	    int pageCount = Integer.parseInt(pageCountText);
		System.out.println(pageCount);
		   
		System.out.println(sIndex);
		System.out.println(eIndex);
		
		for(int p=1;p<=pageCount;p++) {
			
			WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println( activePage.getText());
			 activePage.click();
			 
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(rows);
			
			String pageno=Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[contains(text(),'"+pageno+"')]")).click();
		}
	
		
		

	}

}
