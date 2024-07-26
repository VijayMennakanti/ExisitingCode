package pack9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		String month="July 2024";
		String selectDay="20";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
	//	String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		Thread.sleep(2000);
		
		while(true) {
			
			String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		
			if(text.equals(month)) {
				
				break;
				
			}
			else {
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		
        String xpathText="//td[@data-handler='selectDay']/a[text()=\'"+selectDay+"\']";
		driver.findElement(By.xpath(xpathText)).click();
		
		
	}

}
