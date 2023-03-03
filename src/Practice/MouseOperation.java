package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		String windowid=driver.getWindowHandle();
		//System.out.println(windowid);
		
		//To go into that particular frame which will switch the starting to i-frame
        
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement srcelement,trgelement;
		srcelement=driver.findElement(By.id("draggable"));
		trgelement=driver.findElement(By.id("droppable"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		
		driver.switchTo().window(windowid);
		driver.findElement(By.linkText("Demos")).click();
		driver.close();

		
	}

}
