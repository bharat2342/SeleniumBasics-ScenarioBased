package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
		
        
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		/*
		 * driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		 * 
		 * //Thread.sleep(5000);
		 * 
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		 */
		driver.close();

	}

}
