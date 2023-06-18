package ScenarioBasedModels;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks 
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Customized CSS li[class='gf-li'] a && "a[href*='soapui']" --This is for one link only
		
		String url= driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		//Now try for other Broken Link 'broken link it has to get 404 as output
		
		// URL is class and OpenConnection is method
		HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();  //Http connection
		//conn.setRequestMethod("HEAD");
		int x=conn.getResponseCode();
		
		System.out.println(x);
		
		driver.close();

	}

}
