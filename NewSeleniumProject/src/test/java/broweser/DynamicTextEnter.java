package broweser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTextEnter {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
	WebElement textArea = driver.findElement(By.id("ta1"));
		
	textArea.clear();
		Scanner sc=new Scanner(System.in);
		
        System.out.println("enter the Dynamic text here");
		String dynamicText = sc.nextLine();
	     textArea.sendKeys(dynamicText);
	     
	     sc.close();
	
	
	}

}
