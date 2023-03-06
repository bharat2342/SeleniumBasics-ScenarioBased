package ScenarioBasedModels;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitScenario
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		Wait<WebDriver> Fluentwait=new  FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		// So here we need to have the customized wait
		
		WebElement foo= Fluentwait.until(new Function<WebDriver,WebElement>()
				{
					public WebElement apply(WebDriver driver)
					{
						if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
						{
							return driver.findElement(By.cssSelector("[id='finish'] h4"));
						}
						else
							return null;
						
						
						
					}
			
				});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		driver.close();
		
		
		

	}

}
