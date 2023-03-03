package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountRows {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("https://money.rediff.com/tools/forex");
		WebElement curtable;
		curtable=driver.findElement(By.className("dataTable"));		
		 
		List<WebElement> rows=curtable.findElements(By.tagName("tr"));
		System.out.println(rows.size());

	}

}
