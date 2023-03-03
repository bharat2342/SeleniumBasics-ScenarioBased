package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksWithUrls {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.linkText("redRail")).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			String linkname=links.get(i).getText();
			String linkurl=links.get(i).getAttribute("href");
			
			System.out.println(linkname+"   "+linkurl);
			
		}
		System.out.println(links.size());
		driver.close();

	}

}
