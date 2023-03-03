package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Navigation {

	public static void main(String[] args) {
		
		 /* System.setProperty("webdriver.chrome.driver","D:\\Testing_Practice\\chromedriver.exe"); 
		  WebDriver driver= new ChromeDriver(); 
		 
		  
		  driver.get("http://www.gmail.com");
		 */
		      System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
		      WebDriver driver=new FirefoxDriver();
			  driver.manage().deleteAllCookies();
			  driver.get("https://www.facebook.com");
			  driver.navigate().to("https://gmail.com");
			  driver.navigate().back();
			  driver.navigate().forward();
			  driver.close();
	}

}
