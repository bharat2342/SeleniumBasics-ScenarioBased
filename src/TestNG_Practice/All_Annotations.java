package TestNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {
	
	// We Invoke all the annotations usage for simple examples
	@Test(priority=0)
	public void sendMail()
	{
		System.out.println("Send Mail Test");		
	}
	
	@Test(priority=1)
	public void receiveMail()
	{
		System.out.println("Receive Mail Test");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("GMail Login");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("GMail Logout");
	}
	
	@BeforeClass
	public void launchApp()
	{
		System.out.println("Launch GMail App");
	}
	
	@AfterClass
	public void closeApp()
	{
		System.out.println("Close GMail App");
	}
	
	@BeforeTest
	public void deleteCookies()
	{
		System.out.println("Delete Browser Cookies");
	}
	
	@AfterTest
	public void closeAllBrowsers()
	{
		System.out.println("Cloes All Browsers");
	}
	
	@BeforeSuite
	public void invokeWebDriver()
	{
		System.out.println("Invoke WebDriver");
	}
	
	@AfterSuite
	public void killWebDriver()
	{
		System.out.println("Kill WebDriver");
	}
}
