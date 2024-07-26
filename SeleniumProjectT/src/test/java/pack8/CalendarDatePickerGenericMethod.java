package pack8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDatePickerGenericMethod {

	static WebDriver driver;
	public static void main(String[] args) {

	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement dateInputBar = driver.findElement(By.id("datepicker"));
		dateInputBar.click();
		
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		selectDateInCalendar("2", "June", "2025");
}
   public static void selectDateInCalendar(String selectDay, String selectMonth, String selectYear) {
	   
	   if(Integer.parseInt(selectDay)>31) {
		   
		   System.out.println("Invalid Date Provided :"+selectDay+"/"+selectMonth+"/"+selectYear);
		   return;
		   
	   }
	   if(selectMonth.equals("February")&&Integer.parseInt(selectDay)>29) {
		   
		   System.out.println("Invalid Date Provided :"+selectDay+"/"+selectMonth+"/"+selectYear);
		   return;
		   
	   }
	   
	   
	   
	   String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	   System.out.println(monthYear);
			
		String month = monthYear.split(" ")[0];
	    System.out.println(month);
	    
		String year = monthYear.split(" ")[1];
	    System.out.println(year);
		
	   
	   while(!(month.equals(selectMonth)&&year.equals(selectYear))) {
		   
		   driver.findElement(By.xpath("//a[@title='Next']")).click();
		   
		    monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		    month = monthYear.split(" ")[0];
			 
			year = monthYear.split(" ")[1];

		   
		   
		   
		   
	   }
	   
	   String textXpath="//a[normalize-space()=\'"+selectDay+"\']";
	  try { 
	   driver.findElement(By.xpath(textXpath)).click();
	  }catch(Exception e) {
		  
		  
		  System.out.println("Invalid Date Provided :"+selectDay+"/"+selectMonth+"/"+selectYear);
	  }
   }
	
	
	
	
	
	
	
	
}
