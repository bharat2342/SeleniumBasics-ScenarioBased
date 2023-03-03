package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("Fuck");
		driver.findElement(By.id("pass")).sendKeys("suck");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[@Value='submit']")).click();

	}

}
