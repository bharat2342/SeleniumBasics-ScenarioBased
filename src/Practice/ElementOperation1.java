package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.facebook.com");
		  driver.findElement(By.linkText("Log In")).click();
		  String X= driver.getTitle();
		  System.out.println(X);
		  driver.close();

	}

}
