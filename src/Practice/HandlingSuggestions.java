package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSuggestions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
        driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyd");
		
		
		List<WebElement> fromcities=driver.findElement(By.xpath("//section/div/div[1]/div/ul")).findElements(By.tagName("li"));
		System.out.println(fromcities.size());
		
		for(int i=0;i<fromcities.size();i++)
		{
			String cityname= fromcities.get(i).getText();
			System.out.println(cityname);
		}
		driver.close();

	}

}
