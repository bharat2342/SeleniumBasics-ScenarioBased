package ScenarioBasedModels;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitScenarioBased
{
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		WebDriverWait explicitwait= new WebDriverWait(driver, 10);
		//Other way
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		//After this we get the warning message here so go and inspect and do but not a pop-up
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        //driver.findElement(By.id("okayBtn")).click();
		
		
		driver.findElement(By.cssSelector("#okayBtn")).click();
		
		
		//For Drop-down other way 
		/*
		 * Select dropdown = new Select(options);
		 * dropdown.selectByValue("consult");
		 * driver.findElement(By.id("signInBtn")).click();
		 */
		driver.findElement(By.xpath("//select[@data-style='btn-info']/option[@value='consult']")).click();
		driver.findElement(By.cssSelector("#okayBtn")).click(); //Here I used 2 times
		
		//driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		
		driver.findElement(By.id("signInBtn")).click();
		
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));		
		
		
		
		List <WebElement> products =driver.findElements(By.cssSelector(".card-footer .btn-info"));
		//By x-path
		//driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		

		for(int i =0;i<products.size();i++)

		{
		    products.get(i).click();
		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.close();
		

	}

}
