package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
        List<WebElement> links=driver.findElements(By.tagName("a"));
        //System.out.println(links);
       
        boolean linkexist=false;
		String explink,actlink;
		explink="games";
		
		for(int i=0;i<links.size();i++)
		{
			actlink=links.get(i).getText();
			if(explink.equalsIgnoreCase(actlink))
			{
				linkexist=true;
				break;
			}
		}
		
		if(linkexist)
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}
		
	
		driver.close();
		
		
		//Other way of writing the code
		 //Using Try and Catch statements
        /*
		String linkname="demo";
		
		try 
		{
			driver.findElement(By.linkText(linkname));
			System.out.println("Test Pass");
			
		} catch (Exception e) 
		{
			System.out.println("Test Fail");
			
		}
		*/

	}

}
