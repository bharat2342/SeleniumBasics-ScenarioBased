package OrangeHrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarUsage {

	public static void main(String[] args) {
		String appdate="10/May/1993";
		String[] temp= appdate.split("/");
		String dt,month,year;
		dt=temp[0];
		month=temp[1];
		year=temp[2];
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Open the Application type Id & Pwd and then Login
        driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click Recruitment and Candidates then the calendar element
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		
		// To select the Month and make it visible (It will be May as declared earlier)
		Select mlist=new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month);
		
		// To select the Year and make it visible (It will be 1993 as declared earlier)
		Select ylist=new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);
		
		//To select the Date since it will be table so we need to pick the previous used method tr & td entire table
		WebElement cal=driver.findElement(By.className("ui-datepicker-calendar"));
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
