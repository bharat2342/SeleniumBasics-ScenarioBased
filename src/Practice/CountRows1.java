package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountRows1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("https://money.rediff.com/tools/forex");
        driver.findElement(By.linkText("Mutual Funds")).click();
        
       
        //To get count of entire table web elements
        WebElement curtable;
		curtable=driver.findElement(By.className("dataTable"));		 
		List<WebElement> rows=curtable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		
		//To read entire table with all web elements and print the table
		WebElement branchestable;
		branchestable=driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows1=branchestable.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows1.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data +" ");
			}
			System.out.println();
		}
		//driver.close();
		
		
		
		
		
		
		
		/*for(int i=0;i<rows.size();i++)
 		{
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String keyword=cols.get(i).getText();
			System.out.println(keyword);
 			//System.out.println("Row No: "+(i+1)+" No. of Columns: "+cols.size());
 		}
*/

        
       
        
       

	}

}
