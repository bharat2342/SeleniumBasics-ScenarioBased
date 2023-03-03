package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.snapdeal.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[2]/ul/li[4]/a/span[2]")));
		act.build().perform();

		act.contextClick(driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[4]/div/div[1]/div/div/p[7]/a/span")));

	}

}
