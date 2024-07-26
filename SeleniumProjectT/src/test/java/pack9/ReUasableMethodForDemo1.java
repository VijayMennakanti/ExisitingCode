package pack9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUasableMethodForDemo1 {
	String selectMonth;
	String selectDay;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		
		selectingDate("August 2024","32");
		
		}
	
	
	public static void selectingDate(String selectMonth, String selectDay) {
		 if(Integer.parseInt(selectDay)>31) {
			   
			   System.out.println("Invalid Date Provided :"+selectDay+"/"+selectMonth+"/");
			   
			   return;
			   }
			   
		
while(true) {
			
			String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		
			if(text.equals(selectMonth)) {
				
				break;
				
			}
			else {
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
                 String xpathText="//td[@data-handler='selectDay']/a[text()=\'"+selectDay+"\']";
               try {  driver.findElement(By.xpath(xpathText)).click();
               }catch(Exception e) {
            	   System.out.println("Invalid Date Provided :"+selectDay+"/"+selectMonth+"/");
            	   
               }
               }


	}

