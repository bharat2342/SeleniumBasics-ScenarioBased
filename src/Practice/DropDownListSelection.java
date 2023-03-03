package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Select 	dlist = new Select(driver.findElement(By.id("day")));
		dlist.selectByVisibleText("20");
		
		Select mlist=new Select(driver.findElement(By.id("month")));
		mlist.selectByValue("11");
		
		WebElement yelement;           // Other way of creating an Object for select class
		yelement=driver.findElement(By.id("year"));
		Select ylist=new Select(yelement);
		
		ylist.selectByIndex(1);

	}

}
