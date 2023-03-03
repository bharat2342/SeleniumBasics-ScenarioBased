package Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowIdsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
        driver.get("http://gmail.com");
        driver.findElement(By.linkText("Help")).click();
        
        //To get the window IDs for all the above links
        Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);	

	}

}
