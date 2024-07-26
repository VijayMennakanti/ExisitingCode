package pack9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo2 {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.ca/");
		driver.findElement(By.name("EGDSDateRange-date-selector-trigger")).click();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uitk-calendar uitk-calendar-day-selection-circle uitk-no-gridlines']")));

		String month="February 2024";
		String exp_Date="26";
		
		
		
    while(true) {
    	
    	String text=driver.findElement(By.xpath("(//span[@class='uitk-align-center uitk-month-label'])[1]")).getText();
    	
    	if(text.equals(month)) {
    		
    		break;
    		
    		
    	}else {
    		
    		
    		driver.findElement(By.xpath("//button[@data-stid='uitk-calendar-navigation-controls-next-button']")).click();
    	} 
    		
    		
    	
    	
    }
    
    List<WebElement> allDates = driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr/td/div[1]/div[2]"));
    
     for (WebElement ele:allDates) {
    	 
    	 
    String dateText	=ele.getText(); 
    	 
    	if(dateText.equals(exp_Date)) {
    		
    		ele.click();
    		break;
    		
    	}
    	 
     }
	}

}
