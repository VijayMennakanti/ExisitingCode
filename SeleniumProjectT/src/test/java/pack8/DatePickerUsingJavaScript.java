package pack8;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUsingJavaScript {

	public static void main(String[] args) {
		ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			
			
			JavascriptExecutor jse = ((JavascriptExecutor)driver);
			
			jse.executeScript("document.getElementById('datepicker').value='10/12/2024'" );

	}

}
