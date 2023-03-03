package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Demo");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(Keys.CONTROL,Keys.END);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Abc");

	}

}
