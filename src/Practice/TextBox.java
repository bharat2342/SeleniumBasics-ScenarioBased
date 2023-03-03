package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//select the element of any suggestion and then inspect entire list box needs to be inspected
		List<WebElement> keywords=driver.findElement(By.className("erkvQe")).findElements(By.tagName("li"));
			 System.out.println(keywords.size());
			 
			 WebElement parentelement;
				parentelement=driver.findElement(By.className("erkvQe"));
				List<WebElement> childelements=parentelement.findElements(By.tagName("li"));
				System.out.println(childelements.size());
				
				for(int i=0;i<childelements.size();i++)
				{
					String keyword=childelements.get(i).getText();
					System.out.println(keyword);
				}


	}

}
