package test_class;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword {
	 @BeforeMethod
	 public void beforeMethod()
       {
			System.out.println("beforeMethod");
		}
	@Test(priority=1)//less no high priority
	public void verifylogin() 
	{
		Assert.fail();
		System.out.println("verifylogin");
	}
	@Test(enabled=false,priority=1,invocationCount=3,timeOut=500)
	public void verifyhome() 
	{
		System.out.println("verifyhome");
	}
	@Test(dependsOnMethods= {"verifylogin"})//(priority=3,dependsOnMethods= {"verifylogin"})
	public void verifyadmin() 
	{
		System.out.println("verifyadmin");
	}

	 @AfterMethod
	 public void aftermethod()
		{
			System.out.println("aftermethod");
		}
	
	public static void main(String[] args)
	{
		
		

	}
	
	/*TESTNG
	 * it java unit famework used to design the testclasses.
	 * uses->maintain flow of execution of testclasses,generate report,
	 * execute multiple testclasses using testng suit 
	 * KEYWORD
	 * 1.priority:->
	 * 
	 *  if priority are same then goes with alphabetically
	 * lowest no highest priority
	 *' 0' is default priority
	 **/

}
