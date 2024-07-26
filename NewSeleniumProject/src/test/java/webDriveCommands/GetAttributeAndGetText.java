package webDriveCommands;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeAndGetText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");

		String textBetweenTags = driver.findElement(By.xpath("//div[@id='Text1']//div[@class='widget-content']"))
				.getText();

		System.out.println("textBetweenTags  :" + textBetweenTags);

		String attributeValue = driver.findElement(By.xpath("//div[@id='crosscol']")).getAttribute("name");

		System.out.println("attributeValue  :" + attributeValue);

	}

}
