package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
		driver.get("https://www.goibibo.com/");
		WebElement radio;
		radio=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/ul/li[2]/span[2]"));
         System.out.println(radio.isSelected());
		
		radio.click();
		
		System.out.println(radio.isSelected());
		
		
		//driver.get("https://www.cleartrip.com/");
		
		/*WebElement radio;
		radio=driver.findElement(By.className("sc-fctJkW iiBCvz"));
		
		System.out.println(radio.isSelected());
		
		radio.click();
		
		System.out.println(radio.isSelected());
*/
	}

}
