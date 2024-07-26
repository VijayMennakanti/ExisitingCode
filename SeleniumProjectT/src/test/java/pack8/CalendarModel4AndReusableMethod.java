package pack8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarModel4AndReusableMethod {
	static WebDriver driver;
	public static void main(String[] args) {
        driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 
		 driver.findElement(By.id("fourth_date_picker")).click();
		 
		 selectDateFromCalendar("1", "Jan", "2024");



	}
	public static void selectDateFromCalendar(String selectDay, String selectMonth, String selectYear) {
		 
		 
		 WebElement monthMenu = driver.findElement(By.className("ui-datepicker-month"));
			Select slect1 = new Select(monthMenu);
			slect1.selectByVisibleText(selectMonth);
			
			WebElement yearMenu = driver.findElement(By.className("ui-datepicker-year"));
			Select select2 = new Select(yearMenu);
			select2.selectByVisibleText(selectYear);
			
		//	String eDay=selectDay;
			String dynamicXpath="//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()=\'"+selectDay+"\']";

			driver.findElement(By.xpath(dynamicXpath)).click();
		 
}
	
}
