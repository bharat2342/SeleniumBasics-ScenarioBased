package ScenarioBasedModels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegexExpressions 
{

	public static void main(String[] args) 
	{
		
		// Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Launch the browser and navigate to the webpage
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        // Locate the TextBox element and enter the text
        WebElement textBox = driver.findElement(By.id("textbox-id"));
        textBox.sendKeys("abc123");

        // Get the entered text and check whether it is alphabetic or numeric
        String enteredText = textBox.getAttribute("value");  //we extract the values here

        //Now we use the java regex expressions
        
        Pattern alphabeticPattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher alphabeticMatcher = alphabeticPattern.matcher(enteredText);

        Pattern numericPattern = Pattern.compile("^[0-9]+$");
        Matcher numericMatcher = numericPattern.matcher(enteredText);

        if (alphabeticMatcher.matches()) 
        {
            System.out.println("Entered text is alphabetic");
        } 
        else if (numericMatcher.matches()) 
        {
            System.out.println("Entered text is numeric");
        } 
        else
        {
            System.out.println("Entered text is alphanumeric");
        }

        // Close the browser
        driver.quit();
        
        //To check with ASCII codes
		/*
		 * public static boolean isAlphabetic(String str) 
		 * { 
		 * for (int i = 0; i <str.length(); i++)
		 *  { 
		 *  char c = str.charAt(i); 
		 *  if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
		 *   { 
		 *   return false; 
		 *   } 
		 *   }
		 *    return true; 
		 *   }
		 * 
		 * public static boolean isNumeric(String str) 
		 * {
		 *  for (int i = 0; i < str.length(); i++) 
		 *  {
		 *   char c = str.charAt(i); 
		 *   if (!(c >= '0' && c <= '9')) 
		 *   {
		 *     return false; 
		 *     }
		 *      }
		 *       return true;
		 *        }
		 */

		
		

	}

}
