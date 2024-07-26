package cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCookies {

	// Retrieving the all cookies from the website.

	static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.get("https://www.qafox.com/");

		resuableMethod(driver);

		System.out.println("---------------------");

		DeleteAllCookies(driver);

		System.out.println("---------------------");
		differentMaethodsofCookies(driver);
		
		System.out.println("---------------------");
		deletingOnlyOneCookie(driver);
		
		System.out.println("---------------------");
		addingnewCookie(driver);
	}

	public static void resuableMethod(WebDriver driver) {

		driver.get("https://www.qafox.com/");

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println("size of the cookies before deleting :::" + cookies.size());

	}

	public static void DeleteAllCookies(WebDriver driver) {

		driver.get("https://www.qafox.com/");

		driver.manage().deleteAllCookies();
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of the cookies after deleting :" + cookies.size());

	}

	public static void differentMaethodsofCookies(WebDriver driver) {

		driver.get("https://www.qafox.com/");

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();

		while (itr.hasNext()) {

			Cookie cookie = itr.next();

			System.out.println("Name of the cookie :" + cookie.getName());

			System.out.println("Value of the Cookie :" + cookie.getValue());
			System.out.println("Domain of the Cookie :" + cookie.getDomain());
			System.out.println("Path of the Cookie : " + cookie.getPath());
			System.out.println("Expiry of the cookie :" + cookie.getExpiry());
			System.out.println("-------------------------------------------------------");

		}

	}

	public static void deletingOnlyOneCookie(WebDriver driver) {

		driver.get("https://www.qafox.com/");

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();

		while (itr.hasNext()) {

			Cookie cookie = itr.next();

			if (cookie.getName().equalsIgnoreCase("_gid")) {

				System.out.println("delete the cookie :" + cookie.getName());
				driver.manage().deleteCookie(cookie);
			}

		}

		Set<Cookie> cookies2 = driver.manage().getCookies();
		Iterator<Cookie> itr2 = cookies2.iterator();

		while (itr2.hasNext()) {

			Cookie cookie = itr2.next();
			System.out.println("Remaining cookies names :" + cookie.getName());

		}

		
		
	}

	public static void addingnewCookie(WebDriver driver) {
		
		driver.get("https://www.qafox.com/");

		// Adding a new Cookie
		
		Cookie c = new Cookie("vijay Mennakanti","@034");
		driver.manage().addCookie(c);
		
		
		// Retrieving all the cookies.
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		
		while(itr.hasNext()) {
			
			
		Cookie cookie = itr.next();
			
			System.out.println("name of the cookie " +cookie.getName()+":>>>"+   " value"  +cookie.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
