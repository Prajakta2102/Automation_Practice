package test_class;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}

	@BeforeMethod
	 public void beforeMethod()
        {
			System.out.println("beforeMethod");
		}
	@Test
	    public void test1()
		{
			System.out.println("test1");
		}
	 
	 @Test
	 public void test2()
	 {
		 System.out.println("test2"); 
	 }

	 @AfterMethod
	 public void aftermethod()
		{
			System.out.println("aftermethod");
		}
	
	 @AfterClass
	 public void afterClass()
		{
			System.out.println("afterClass");
		}
}
