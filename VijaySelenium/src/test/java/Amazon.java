import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Launching browsers by uing the WebDriverManager
		 
	    ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=2679132879155695153&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299297&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

		Thread.sleep(3);

	}

}