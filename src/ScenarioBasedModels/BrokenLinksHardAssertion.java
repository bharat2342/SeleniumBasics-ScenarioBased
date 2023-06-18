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
import org.testng.Assert;

public class BrokenLinksHardAssertion
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
	
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();  
			conn.connect();
			int respCode=conn.getResponseCode();
			
			if(respCode>400)
			{
				System.out.println("The Link with the text  " +link.getText()+ "is broken with the code  " +respCode);
				Assert.assertTrue(false);
			}
			
			
		}
		
		
		
		driver.close();

		
		
		
		
	}

}
