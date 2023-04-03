package test_class;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("beforesuit");
	}
@BeforeTest
	public void BeforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void beforeClass2()
	{
		System.out.println("beforeClass2");
	}

	@BeforeMethod
	 public void beforeMethod2()
        {
			System.out.println("beforeMethod2");
		}
	@Test
	    public void test2()
		{
			System.out.println("test2");
		}
	 
	 @Test
	 public void test3()
	 {
		 System.out.println("test3"); 
	 }

	 @AfterMethod
	 public void aftermethod2()
		{
			System.out.println("aftermethod2");
		}
	
	 @AfterClass
	 public void afterClass2()
		{
			System.out.println("afterClass2");
		}
	 @AfterTest
		public void afterTest()
		{
			System.out.println("aftertest");
		}
	@AfterSuite
	public void afterSuite()
		{
			System.out.println("aftersuit");
		}
	
}
