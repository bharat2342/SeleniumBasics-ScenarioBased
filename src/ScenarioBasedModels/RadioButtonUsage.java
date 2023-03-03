package ScenarioBasedModels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonUsage
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		//To select and checkbox is checked
		driver.findElement(By.xpath("(//fieldset/label/input[@type='checkbox'])[1]")).click();
		
		Boolean x=driver.findElement(By.xpath("(//fieldset/label/input[@type='checkbox'])[1]")).isSelected();
		System.out.println(x);
		
		//Now it will de-select
		driver.findElement(By.xpath("(//fieldset/label/input[@type='checkbox'])[1]")).click();
		
		Boolean y=driver.findElement(By.xpath("(//fieldset/label/input[@type='checkbox'])[1]")).isSelected();
		System.out.println(y);
		
		//To get the size of check-boxes
		//Here we traversed from parent to child
		//(//*[@id="checkbox-example"] /fieldset//input)[3] this is index
		int checkboxes=driver.findElements(By.xpath("//*[@id='checkbox-example'] /fieldset//input")).size();
		System.out.println(checkboxes);
		
		
		driver.close();
		

	}

}
