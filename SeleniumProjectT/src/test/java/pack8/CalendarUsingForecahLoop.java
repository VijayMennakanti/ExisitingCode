package pack8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarUsingForecahLoop {
	static WebDriver driver;
	public static void main(String[] args) {
		  driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
			 
			 driver.findElement(By.id("third_date_picker")).click();
			 
			 selectDateFromCalendar("17", "Oct", "2028");


	}
	
	public static void selectDateFromCalendar(String selectDay, String selectMonth, String selectYear) {
		 
		 
		 WebElement monthMenu = driver.findElement(By.className("ui-datepicker-month"));
			Select slect1 = new Select(monthMenu);
			slect1.selectByVisibleText(selectMonth);
			
			WebElement yearMenu = driver.findElement(By.className("ui-datepicker-year"));
			Select select2 = new Select(yearMenu);
			select2.selectByVisibleText(selectYear);
			
			String date=selectDay;
			
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
			
			for(WebElement ele:allDates) {
				
				
				String dateText = ele.getText();
				
				if(dateText.equals(selectDay)) {
					
					ele.click();
					break;
				}
			}
			
			
		 

}
}