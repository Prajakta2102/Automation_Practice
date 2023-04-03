package test_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Facebook 
{
	WebDriver driver;

	
	@BeforeMethod
	public void launch_ChromeBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://m.facebook.com/?locale2=en_GB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@Test(priority=-1,invocationCount=2)
	public void verify_TitleOfFaceBook()
	{
        String title=driver.getTitle();
        System.out.println(title);
	}
	
	@Test
	public void verify_EmailText()
	{
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		String text=Email.getText();
		 System.out.println(text);
	}
	@Test(enabled=false)
	public void enter_Email()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("prajaktakalmegh@gamil.com");
		 
	}
	
	@AfterMethod
	public void quit_ChromeBrowser()
	{
      driver.quit();
		
	}

}
