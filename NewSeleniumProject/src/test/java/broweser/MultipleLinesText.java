package broweser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinesText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement textArea = driver.findElement(By.id("ta1"));

		textArea.clear();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the text here:");
	
		
		
		StringBuilder dynamicText = new StringBuilder();
		
		String line;
		
		while(!(line=sc.nextLine()).equals("done")) {
			
			dynamicText.append(line).append("\n");
			
			
		}
	
		textArea.sendKeys(dynamicText.toString());
	
		
		sc.close();
		
		
		

	}

}
