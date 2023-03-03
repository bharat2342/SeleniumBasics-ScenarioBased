package PrimusBank;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EntireTableElemntsOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		
		
		//To Store all elements in list and in the branches 
		WebElement branchestable;
		branchestable=driver.findElement(By.id("DG_bankdetails"));
		
		// List of web elements stored by a tag name tr
		List<WebElement> rows=branchestable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(int i=1;i<rows.size()-1;i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			cols.get(6).findElement(By.tagName("a")).click();			
			driver.findElement(By.name("txtadd2u")).sendKeys("Sample Add2");
			driver.findElement(By.id("btnupdate")).click();
			driver.switchTo().alert().accept();			
			
			branchestable=driver.findElement(By.id("DG_bankdetails"));
			rows=branchestable.findElements(By.tagName("tr"));
			
		}
		//driver.close();

	}

}
