package pack8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDatePickerNormalMethod {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dateInputBar = driver.findElement(By.id("datepicker"));
		dateInputBar.click();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		
	String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	
	System.out.println(monthYear);
		
	String month = monthYear.split(" ")[0];
		 System.out.println(month);
	String year = monthYear.split(" ")[1];
  System.out.println(year);
	
	while(!(month.equals("November")&& year.equals("2024"))) {
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		
		//Thread.sleep(2000);
		
		monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	    month = monthYear.split(" ")[0];
		 
		year = monthYear.split(" ")[1];
		
		
		
	}
			 
			 driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
		 

	
	}
		 
		 
	 }
	   
	   
	   
	   
	   
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	

