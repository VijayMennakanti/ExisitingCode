package spack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MW {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/"); // parent window                 // ArrayList
	
		driver.findElement(By.linkText("Blogger")).click();// child1
		
		driver.findElement(By.id("selenium143")).click();// child2
		
	Set<String> windowsIDS = driver.getWindowHandles();
		
		 ArrayList<String> alist = new ArrayList<String>(windowsIDS);
		 
		/*String parentid = alist.get(0);
        String childid1 = alist.get(1);
        String chileid2 = alist.get(2);
      
      /*  System.out.println("parentid: "+parentid);
        System.out.println("chileid1: "+childid1);
        System.out.println("childid2: "+chileid2);*/

        for(String winid:alist) {
        	
        	
        	String str = driver.switchTo().window(winid).getTitle();
        //	System.out.println(str);
        	
        	if(str.equals("omayo (QAFox.com)")) {
        		
  	 driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden')]")).clear();
        
    
        	}if (str.equals("Blogger.com - Create a unique and beautiful blog easily.")||str.equals("Selenium143 ")) {
        		
        		driver.close();
        		
        	}
        	
       
        }
        
        Thread.sleep(3000);
	}

}

