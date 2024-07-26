package broweser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DifferentBrowser {

	public static void main(String[] args) throws InterruptedException {

             Scanner sc = new Scanner(System.in);
             System.out.println("Enter browser name");
             
            String browser = sc.nextLine();
            
            WebDriver driver=null;
            
            if (browser.equals("Firefox")) {
            	
            	driver=new FirefoxDriver();
            }else if(browser.equals("Chrome")) {
            	
            	driver=new ChromeDriver();
            	
            }else {
            	
            	System.out.println("invalid browser");
            }
             
    
            driver.manage().window().maximize();
           
	}

}
