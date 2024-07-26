package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTutorial1 {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
	
		/* 1. By Using findElement method to findout the single web-element.
		
		//WebElement searchBox = driver.findElement(By.id("small-searchterms"));
	//	searchBox.sendKeys("vijay");*/
		
		// 2. Try to find the Multiple webelements by using findElement.
		
	/*	WebElement ele = driver.findElement(By.xpath("(//div/strong)[5]/following::a"));
		
		System.out.println(ele.getText());
		Dimension size = ele.getSize();
	
		System.out.println(size.height);
		System.out.println(size.width); // finally if we give multiple webelments location to the findelement it returns only the first element of the links*/
		
		
	/*	// 3. Suppose if give element which is not available on the web-page.
		
		String str = driver.findElement(By.xpath("(//div/strong)[5]/following")).getText();
		
		System.out.println(str);      // finally it returns No Such Element Exception. */
		
//*******findElements() method 1. finding Multiple web-elements.*************************************
		

	/*	List<WebElement> links = driver.findElements(By.xpath("//ul[@class='list']//a"));
	
		 
		int si = links.size();
		System.out.println(si);
		
		for(WebElement EE:links) {
			
			System.out.println(EE.getText()); 
		}  */
		
	// 2.Finding Single Element By using the findElements method.
		
		
	/*	List<WebElement> link = driver.findElements(By.linkText("Search"));
		
		int size = link.size();
		
		for(int i=0;i<link.size();i++) {            // we can also create by using the For-each loop.
			
		System.out.println(link.get(i).getText());
			
		}                                           // Finally it returns single web-element   */

		
		
	// 3. giving the unavailable web-element locator path.		
		
		List<WebElement> links = driver.findElements(By.xpath("//a[@id='vijay']"));
		
		System.out.println(links.size());    // it returns the zero.
		
	
	}

}
