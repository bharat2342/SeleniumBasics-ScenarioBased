package OrangeHrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBusCalendar {

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
		
		 driver.get("https://www.redbus.in/");
		 driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click();
		 
		// To select the Month and make it visible (It will be May as declared earlier)
			//Select mlist=new Select(driver.findElement(By.className("monthTitle")));
			//mlist.selectByVisibleText(month);
		 
		 WebElement cal=driver.findElement(By.id("rb-calendar_onward_cal"));
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
			//driver.close();
		 
		 
		 
		
	}

}
