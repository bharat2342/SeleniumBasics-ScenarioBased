package ScenarioBasedModels;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScopeConcepts
{

	public static void main(String[] args) throws InterruptedException 
	{
		//This is particulary find all the links at footer section

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To limit the count of links
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3-it is gradually decrease the time like going back and again clicking
				WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(coloumndriver.findElements(By.tagName("a")).size());
				
				//4- click on each link in the coloumn and check if the pages are opening-
				for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
				{
					
					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);// opens all the tabs
					Thread.sleep(5000);
					
				}
				
				
			
				
				// opens all the tabs go each and every tab grab title and print
				Set<String> abc=driver.getWindowHandles();//4 tabs are opened
				Iterator<String> it=abc.iterator();
				
				while(it.hasNext())    //(hasnext tells weather next WindowID is present or not)
				{
					
				   driver.switchTo().window(it.next());    //it.next(it actually moves to next index)
				   System.out.println(driver.getTitle());
				
				}
		
		

	}

}
