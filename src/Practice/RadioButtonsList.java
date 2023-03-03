package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsList {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
        //driver.get("https://www.cleartrip.com/");
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(radios.size());
		
		
		for(int i=0;i<radios.size();i++)
		{
			String radioname=radios.get(i).getAttribute("value");
			System.out.println(radioname);
		}

	}

}
