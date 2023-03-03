package GreenKart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonExample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/s?i=fashion&bbn=16491484031&rh=n%3A6648217031%2Cn%3A16491484031%2Cn%3A7459781031%2Cn%3A1968024031%2Cn%3A1968093031%2Cp_n_pct-off-with-tax%3A27060456031&s=apparel&dc&ds=v1%3AyXm3o4zDUGM%2B3K1%2FhAQHAyNYIrKFz1DFMWFu870UDMg&pf_rd_i=1968024031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=306a6e16-673b-40ae-81e4-422dde933867&pf_rd_r=H04KRSBPWZH9NSHEKY50&pf_rd_s=merchandised-search-12&qid=1658733433&rnid=2665398031&ref=sr_nr_p_n_pct-off-with-tax_5");
		
		List<WebElement> products= driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base"));
		
		for (int i=0;i<products.size();i++)
		{
			String names=products.get(i).getText();
			
			if(names.contains("Amazon Brand"))
			{
				driver.findElements(By.xpath("//span[text()='Amazon Brand - Symbol']")).get(i).click();
				break;
			}
			
		}

	}

}
