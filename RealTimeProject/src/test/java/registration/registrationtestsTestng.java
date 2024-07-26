package registration;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class registrationtestsTestng {

	WebDriver driver;
	@Test
	public void RegisterAccountewithallmanadatoryfields() {
		//1.TestCaseID= TC_RF_001.
		//2.TestScanario(TS_001)Register_Functionality.
		//3.TestcaseTitle-Verify Registering an Account by providing only the Mandatory fields
		//4.prerequisite-1. Open the Application (http://tutorialsninja.com/demo) in any Browser
		//5.Teststeps

				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.get("https://tutorialsninja.com/demo/");

				driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
				driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("vijay");
				driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mennakanti");
				
				Date date =new Date();
				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
				driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9940003222");
				driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("99400");
				driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("99400");
				driver.findElement(By.xpath("//input[@name='agree']")).click();
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Checking whether user successfully logged into the page or not.

				String atualurl = driver.getCurrentUrl();
				String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
				Assert.assertEquals(atualurl, expectedURL);
			       
			    String accounthascreated = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
                String expectedtext = "Your Account Has Been Created!";
                Assert.assertEquals(accounthascreated,expectedtext );
				
				String actualcongratsText = driver.findElement(By.xpath(
							"//div[@id='content']/p[contains(text(),'Congratulations! Your new account has been successfully created!')]"))
							.getText();

				String expectedcongratsText = "Congratulations! Your new account has been successfully created!";
				Assert.assertEquals(actualcongratsText,expectedcongratsText );
					
				driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
				String actualTitle = driver.getTitle();
				String expectedTitle = "My Account";
				Assert.assertEquals(actualTitle,expectedTitle );
				

			}

	
	@Test
	public void RegisterAccountewithallfields() {
		
		
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mennakanti");
		
		Date date=new Date();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9940003222");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("99400");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("99400");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//Checking whether user successfully logged into the page or not.

		String atualurl = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(atualurl, expectedURL);
	       
	    String accounthascreated = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        String expectedtext = "Your Account Has Been Created!";
        Assert.assertEquals(accounthascreated,expectedtext );
		
		String actualcongratsText = driver.findElement(By.xpath(
					"//div[@id='content']/p[contains(text(),'Congratulations! Your new account has been successfully created!')]"))
					.getText();

		String expectedcongratsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualcongratsText,expectedcongratsText );
			
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Account";
		Assert.assertEquals(actualTitle,expectedTitle );

		
		
		
	}
	
	
	
	
	
	
}






