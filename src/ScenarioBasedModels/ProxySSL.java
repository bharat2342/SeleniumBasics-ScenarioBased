package ScenarioBasedModels;

import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySSL 
{

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		// FirefoxOptions options1 = new FirefoxOptions();
		// options1.setAcceptInsecureCerts(true);
        // EdgeOptions options2 = new EdgeOptions();
		
		//Proxy proxy = new Proxy();

		//proxy.setHttpProxy("ipaddress:4444");

		//options.setCapability("proxy", proxy);
		//Map<String, Object> prefs = new HashMap()<String, Object>();
		
		//Default directory the path needs to be saved here
		//prefs.put("download.default_directory", "/directory/path");
     	//options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	
		
		

	}

}
