package pack9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws Exception {
		
	
		String targetDate="19-01-2025";
		
	    DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate eld = LocalDate.parse(targetDate,formattedDate );
		
		
		int targetDay = eld.getDayOfMonth();
				
	    int targetMonth = eld.getMonthValue(); 
	    
	    int targerYear = eld.getYear();
			
	   
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.findElement(By.id("first_date_picker")).click();
		
		String actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		int actualMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualMonthText).get(ChronoField.MONTH_OF_YEAR);
		
		String actualYearText = driver.findElement(By.className("ui-datepicker-year")).getText();

		int actualYear = Integer.parseInt(actualYearText);
		
		
		while(actualMonth< targetMonth|| actualYear<targerYear) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
			actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
			actualMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualMonthText).get(ChronoField.MONTH_OF_YEAR);
			actualYearText = driver.findElement(By.className("ui-datepicker-year")).getText();
			actualYear = Integer.parseInt(actualYearText);
		}
		
		while(actualMonth>targetMonth|| actualYear>targerYear) {
			
			
               driver.findElement(By.xpath("//a[@title='Prev']")).click();
			
			actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
			actualMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualMonthText).get(ChronoField.MONTH_OF_YEAR);
			actualYearText = driver.findElement(By.className("ui-datepicker-year")).getText();
			actualYear = Integer.parseInt(actualYearText);
			
			
			
		}
		
	String xpathText="//table[@class='ui-datepicker-calendar']//tr//td[@data-handler='selectDay']//a[text()=\'"+targetDay+"\']";
		
		
		
		driver.findElement(By.xpath(xpathText)).click();
		
		
		
		
		
		
		
		
		
		
	}

}
