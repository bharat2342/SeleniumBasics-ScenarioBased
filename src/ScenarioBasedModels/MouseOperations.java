package ScenarioBasedModels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf']"))).click().sendKeys("Bharat");
		act.build().perform();
		
		
		
		

	}

}
