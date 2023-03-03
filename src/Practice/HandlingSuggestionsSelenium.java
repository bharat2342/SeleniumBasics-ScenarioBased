package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSuggestionsSelenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[3]/iframe")));
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		driver.switchTo().defaultContent();
		
		
       
		/*String alertmsg=driver.switchTo().alert().getText();
		
		if(alertmsg.contains("No thanks"))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			driver.switchTo().alert().dismiss();
		}
		*/
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		
		
		List<WebElement> Keywords=driver.findElement(By.xpath("//div[@class='mkHrUc']")).findElements(By.tagName("li"));
		System.out.println(Keywords.size());
		
		for(int i=0;i<Keywords.size();i++)
		{
			String cityname= Keywords.get(i).getText();
			System.out.println(cityname);
		}
		driver.close();
		
		
		

	}

}
