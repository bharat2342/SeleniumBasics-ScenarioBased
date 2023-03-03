package Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowIdSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
        driver.get("http://gmail.com");
        driver.findElement(By.linkText("Help")).click();
        
        Set<String> allwindows=driver.getWindowHandles();		
		System.out.println(allwindows);
		
		// Converting Set to Array
		Object[] windows= allwindows.toArray();

		//Converting Object datatype to String
		String window1= windows[0].toString();
		String window2= windows[1].toString();
		
		System.out.println(window1);
		System.out.println(window2);
		
		System.out.println(driver.getTitle());		//Focus on 1st Window
		driver.switchTo().window(window2);		
		System.out.println(driver.getTitle());	    // Focus on 2nd window
		
		driver.findElement(By.linkText("Community")).click();
		driver.close();

	}

}
