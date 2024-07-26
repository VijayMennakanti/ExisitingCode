package spack;

import java.util.Iterator;
import java.util.Set;                  // Iterator Method

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MWiterator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/"); // parent window
	
		driver.findElement(By.linkText("Blogger")).click();// child1
		
		driver.findElement(By.id("selenium143")).click();// child2
		
	Set<String> windowsIDS = driver.getWindowHandles();
	
	Iterator<String> itr = windowsIDS.iterator();
	
 while(itr.hasNext()) {
	 
	String windowid = itr.next();
	driver.switchTo().window(windowid);
	if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
		
		driver.findElement(By.xpath("(//section//a)[4]")).click();
		
		
		
	} if(driver.getTitle().equals("omayo (QAFox.com)")) {
	 driver.close();
	 }
	

 }
	Thread.sleep(3000);

	}

}
