package ScenarioBasedModels;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		//For Flights different x-path
		driver.findElement(By.cssSelector(".menu_Flights")).click(); //class name
		//driver.findElement(By.xpath(" //li[@class='menu_Flights']")).click();
		//driver.findElement(By.linkText("Flights")).click();
		
		//For Round Trip Radio-Button
		//driver.findElement(By.xpath(" //li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath(" //li[@data-cy='roundTrip']/span")).click();
		
		//By index
		//driver.findElement(By.xpath("//ul[@class='fswTabs latoRegular darkGreyText']/li[2]")).click();
		
		
		driver.findElement(By.cssSelector(".searchCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		//Till this statement got hyd as keywords
		
		List<WebElement> fromcities=driver.findElements(By.xpath("//div[@role='listbox']"));
		Thread.sleep(3000);
		System.out.println(fromcities.size());
		
		for(int i=0;i<fromcities.size();i++)
		{
			String cityname= fromcities.get(i).getText();
			//System.out.println(cityname);
			
			if(cityname.contains("Hyderabad, India"))
			{
				driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0")).click();
				
			}
		}
		
		
		//This code for the to city and select the Chennai city
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Chennai");
		
		List<WebElement> toCities= driver.findElements(By.cssSelector("#react-autowhatever-1"));
		Thread.sleep(3000);
		System.out.println(toCities.size());
		
		
		for(int j=0;j<toCities.size();j++)
		{
			String cityname= toCities.get(j).getText();
			//System.out.println(cityname);
			
			if(cityname.contains("Chennai, India"))
			{
				driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0")).click();
				
			}
		}
		
		//driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		
		
		
		
		driver.close();
		
		
		

	}

}
