package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CongoSequence 
{

		 @BeforeTest()
		 public void firstOne() 

		 {
		     System.out.println("Let");

		 }

		 @AfterMethod()
		 public void firstOne1() 
		 {
		     System.out.println("Let");
		 }      //1)Let true the let the games begin 

		 @BeforeMethod()

		 public void firstOne2()
		  {
		     System.out.println("Let");
		 }
		 @Test
		 public void secondOne() 
		 {
		     System.out.println("the");
		 }

		 @Test
		 public void thirdOne() 
		 {
		     System.out.println("games");
		 }

		 @AfterTest
		 public void thirdOne1() 
		 {
		     System.out.println("begin");
		 }


	}

