package qaFoxJavaScript;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreatingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
	//	jse.executeScript("alert('vijay mennakanti')");  // alert
		
     //   jse.executeScript("prompt('what is your name')"); // prompt
	
		
//jse.executeScript("confirm ('do you want to proceed')\r\n"
//			+ "");
// Thread.sleep(3000);

    String script="return document.evaluate(\"//div[@class='widget-content'][contains(text(),' This is a sample Text on this page')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.innerText";
	
   String text = (String) jse.executeScript(script);
    
    System.out.println(text);
    
    
	}

}
