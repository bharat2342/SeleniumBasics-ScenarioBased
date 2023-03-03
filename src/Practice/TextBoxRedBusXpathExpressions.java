package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBoxRedBusXpathExpressions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
        //driver.findElement(By.id("src")).sendKeys("Hyd");
		/*List<WebElement> fromcities=driver.findElement(By.xpath("//section/div/div[1]/div/ul")).findElements(By.tagName("li"));
		System.out.println(fromcities.size());
		*/
		
		driver.findElement(By.id("src")).sendKeys("Visakhapatnam");
		List<WebElement> keywords=driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul")).findElements(By.tagName("li"));
		 System.out.println(keywords.size());
		 WebElement parentelement;
			parentelement=driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul"));
			List<WebElement> childelements=parentelement.findElements(By.tagName("li"));
			System.out.println(childelements.size());
			
			for(int i=0;i<childelements.size();i++)
			{
				String keyword=childelements.get(i).getText();
				System.out.println(keyword);
			}
	}

}
