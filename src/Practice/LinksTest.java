package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LinksTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		String exptitle,acttitle;
		exptitle="GMail";
		
		driver.findElement(By.linkText("Gmail")).click();
		acttitle= driver.getTitle();
		
		if(acttitle.toLowerCase().contains(exptitle.toLowerCase()))
		{
			System.out.println("GMail Link Working, Test Pass");
		}else
		{
			System.out.println("GMail Link not Working, Test Fail");
		}
		driver.close();	

	}

}
