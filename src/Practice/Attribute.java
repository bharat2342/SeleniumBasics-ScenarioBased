package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		String x=driver.findElement(By.className("gNO89b")).getAttribute("value");
		System.out.println(x);  // Gets the name of that particular attribute
		String y=driver.findElement(By.linkText("Images")).getAttribute("href");
		System.out.println(y);// Link will get displayed
		

	}

}
