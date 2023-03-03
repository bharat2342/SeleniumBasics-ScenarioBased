package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
	@Test
	public void test1()
	{
		String exptitle,acttitle;
		exptitle="Google";
		acttitle="Google";
		Assert.assertEquals(acttitle, exptitle);
	}
	
	@Test
	public void test2()
	{
		String exptitle,acttitle;
		exptitle="Google";
		acttitle="Gmail";
		Assert.assertEquals(acttitle, exptitle);
	}
}
