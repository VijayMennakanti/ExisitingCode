package registration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCRF001 {

	public static void main(String[] args) {

//1.TestCaseID= TC_RF_001.
//2.TestScanario(TS_001)Register_Functionality.
//3.TestcaseTitle-Verify Registering an Account by providing only the Mandatory fields
//4.prerequisite-1. Open the Application (http://tutorialsninja.com/demo) in any Browser
//5.Teststeps

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mennakanti");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("vijaymennakanti6@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9940003222");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("99400");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("99400");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//Checking whether user successfully logged into the page or not.

		String atualurl = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";

		if (atualurl.equalsIgnoreCase(expectedURL)) {

			System.out.println("User Login successfully and landed on the account page.");

			String accounthascreated = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();

			String expectedtext = "Your Account Has Been Created!";

			if (accounthascreated.equalsIgnoreCase(expectedtext)) {

				System.out.println("proper heading text is Displayed.");

			} else {

				System.out.println("proper heading text is not Displayed.");

			}
			String actualcongratsText = driver.findElement(By.xpath(
					"//div[@id='content']/p[contains(text(),'Congratulations! Your new account has been successfully created!')]"))
					.getText();

			String expectedcongratsText = "Congratulations! Your new account has been successfully created!";

			if (actualcongratsText.equalsIgnoreCase(expectedcongratsText)) {

				System.out.println("Proper Congratulations text displayed.");
			} else {

				System.out.println(" proper congratulation text not displayed.");
			}

		}

		else {

			System.out.println("user failed to register to the login page.");

		}

		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "My Account";

		if (actualTitle.equalsIgnoreCase(expectedTitle)) {

			System.out.println("successfulnavigate to the my account page.");

		} else {
			System.out.println("use not navigate to the my account page.Hence test is failed.");

		}

	}

}
