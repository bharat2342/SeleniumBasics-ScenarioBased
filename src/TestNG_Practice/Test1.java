package TestNG_Practice;

import org.testng.annotations.Test;

public class Test1 {
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
}
