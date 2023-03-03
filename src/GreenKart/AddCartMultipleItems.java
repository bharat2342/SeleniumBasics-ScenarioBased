package GreenKart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddCartMultipleItems 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Practice\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		{

			int j = 0;
			List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
			for (int i = 0; i < products.size(); i++)

			{

				// Brocolli - 1 Kg

				// Brocolli, 1 kg

				String[] name = products.get(i).getText().split("-");
				String formattedName = name[0].trim();

				// format it to get actual vegetable name

				// convert array into array list for easy search this is done to save the memory and in especially arrays will be declared

				// check whether name you extracted is present in arrayList or not-

				List itemsNeededList = Arrays.asList(itemsNeeded);

				if (itemsNeededList.contains(formattedName))

				{

					j++;

					// click on Add to cart
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if (j == itemsNeeded.length) 
					{
						break;
					}

				}

			}

		}
		driver.close();
	}
}



