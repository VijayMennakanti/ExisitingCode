package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetHeroko {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-left");
		
		WebElement leftText = driver.findElement(By.xpath("//html/body[contains(text(),'LEFT')]"));
		String leftchild = leftText.getText();
		
        System.out.println(leftchild);
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("frame-middle");
       WebElement middleframe = driver.findElement(By.xpath("//div[@id='content']"));
       middleframe.getText();
       System.out.println(middleframe.getText());
       
       driver.switchTo().defaultContent();
       driver.switchTo().frame("frame-bottom");
       WebElement bottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
       
		String bottomFrameText = bottomFrame.getText();
       
       System.out.println(bottomFrameText);
       
       
       
       
       
       
       
      
       
        
      
        
        
        
	}

}
