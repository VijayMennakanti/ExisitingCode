package pack8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPreviousDateAndFutureDate {

	public static void main(String[] args) {
		
		String eDate="12-10-2025";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate eld = LocalDate.parse(eDate, dtf);
		
		int eDay   = eld.getDayOfMonth();
		int eMonth = eld.getMonthValue();
		int eYear  = eld.getYear();
		
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		 
		WebElement calendarInputMenu = driver.findElement(By.id("datepicker1"));
		calendarInputMenu.click();
		
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String aMonthText =driver.findElement(By.className("ui-datepicker-month")).getText();
		int aMonth =DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(aMonthText).get(ChronoField.MONTH_OF_YEAR);
	
		
		String aYearText = driver.findElement(By.xpath("//span[text()='2023']")).getText();
		int aYear = Integer.parseInt(aYearText);
		
		while(eMonth<aMonth || eYear<aYear) {
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			aMonth =DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(aMonthText).get(ChronoField.MONTH_OF_YEAR);
			aYearText = driver.findElement(By.xpath("//span[text()='2023']")).getText();
			aYear = Integer.parseInt(aYearText);
		}
		
       while(eMonth>aMonth || eYear>aYear) {
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			aMonth =DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(aMonthText).get(ChronoField.MONTH_OF_YEAR);
			aYearText = driver.findElement(By.xpath("//span[text()='2023']")).getText();
			aYear = Integer.parseInt(aYearText);
		}
		
		String textXpath="//tr//td[@data-handler='selectDay']/a[text()=\'"+eDay +"\']";
		
		driver.findElement(By.xpath(textXpath)).click();
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
