package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTestRedbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		String exptitle,acttitle;
		exptitle="redRail";
		
		driver.findElement(By.id("redRail")).click();
        acttitle= driver.getTitle();
        System.out.println(acttitle);
		
		if(acttitle.toLowerCase().contains(exptitle.toLowerCase()))
		{
			System.out.println("redRail link Working, Test Pass");
		}
		else
		{
			System.out.println("redRail Link not Working, Test Fail");
		}
		driver.close();	

	}

}
