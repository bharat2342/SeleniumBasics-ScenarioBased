package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FluentWait {

	@Test 
	public static void fluentWaitMethod()
	{
			System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
			driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
			//org.openqa.selenium.support.ui.
	//FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>((driver)
			       //.withTimeout(30, TimeUnit.SECONDS)
			       //.pollingEvery(5, TimeUnit.SECONDS)
			       //.ignoring(NoSuchElementException.class);
			 
			
	}

}
