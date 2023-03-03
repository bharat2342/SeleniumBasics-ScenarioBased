package TestNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2_Before_After_Method 
{
	//1st it will execute the Before Method and then Priority then after method Then second priority
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
}
