package OrangeHrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTripCalendar {

	public static void main(String[] args) {
		String appdate="12/Oct/2022";
		String[] temp= appdate.split("/");
		String dt,month,year;
		dt=temp[0];
		month=temp[1];
		year=temp[2];
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
      
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();
		
		
		
		/*
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth;
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		
		WebElement cal=driver.findElement(By.className("calendar"));
		List<WebElement> rows,cols;
		
		rows=cal.findElements(By.tagName("tr"));
		
		boolean flag=false;
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				String caldt=cols.get(j).getText();
				if(caldt.equals(dt))
				{
					cols.get(j).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		 * 
		 */
		
		
		

	}

}
