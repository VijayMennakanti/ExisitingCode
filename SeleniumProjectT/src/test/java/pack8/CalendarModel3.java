package pack8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarModel3 {

	public static void main(String[] args) {
		  
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 
		 driver.findElement(By.id("third_date_picker")).click();
		 
	WebElement monthMenu = driver.findElement(By.className("ui-datepicker-month"));
	Select slect1 = new Select(monthMenu);
	slect1.selectByVisibleText("Nov");
	
	WebElement yearMenu = driver.findElement(By.className("ui-datepicker-year"));
	Select select2 = new Select(yearMenu);
	select2.selectByVisibleText("2022");
	
	String eDay="25";
	String dynamicXpath="//tr/td[@data-handler='selectDay']/a[text()=\'"+eDay+"\']";

	driver.findElement(By.xpath(dynamicXpath)).click();
	}

}
