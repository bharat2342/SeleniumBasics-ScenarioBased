package ScenarioBasedModels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Usage of CSS-Selector & X-path for the text-Box
		driver.findElement(By.cssSelector(".form-control.ng-pristine")).sendKeys("Bharat Kumar");
		//(//input[@name='name'])[1] (By index for X-path)
		//  //input[@class='form-control ng-pristine ng-invalid ng-touched'] -by entire class name
		// //input[contains (@class,'form-control ng-pristine')]
		
		driver.findElement(By.name("email")).sendKeys("bkbharatkumar007@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("chinnu");
		
		//To select the Male from the drop-down and female
		//Customized x-path will be
		
		driver.findElement(By.xpath("//select/option[2]")).click();
		//other way of Writing //option[contains(text(),'Male')]
		
		//Two ways of writing the X-path and CSS-selector for the selection of Employed radio Button
		
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		//div/label[contains(text(),'Employed')] //with using the x-path
		//Parent to child traverse
		//  //div[@class='form-check form-check-inline']/input[@id='inlineRadio2']
		
		
		//driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05-10-2015");
		driver.findElement(By.name("bday")).sendKeys("08/02/1992");
		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		//driver.close();
		

	}

}
