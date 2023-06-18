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
import org.testng.asserts.SoftAssert;

public class BrokenLinksSoftAssertion //Using the soft Assertions
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//broken URL

        //Step 1 -To get all urls tied up to the links using Selenium
        //Java methods will call URL's and gets you the status code
        //if status code >400 then that url is not working-> link which tied to url is broken
        //a[href*="soapui"]'

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
       
     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

     SoftAssert a =new SoftAssert();

    

     for(WebElement link : links)

     {

         String url= link.getAttribute("href");
         //To setup the connection
         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
         conn.setRequestMethod("HEAD");
         conn.connect();

         int respCode = conn.getResponseCode();
         System.out.println(respCode);

         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

     }

 
     a.assertAll();
     driver.close();
	}

}



