 package browser_Launching;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
public class TimeDate 
{
	public static void date_time(WebDriver driver,String datetime)throws InterruptedException,IOException
	{
		//code for datetime
		Date d= new Date();//create Date Class obj
		datetime=d.toString().replace(":", "_").replace(" ", "_");//call method with ref d and replacing with 1st by 2nd
		
		//code for Screenshot
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("D:\\Screenshot_Sele\\screen"+datetime+".png");//datetime var add with filename
	    FileHandler.copy(source,dest);
	 
	    
	}

	public static void main(String[] args)  throws InterruptedException, IOException
	{ 
		
		String date;
		String time;
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup");//pass string as arg return void method of webdriver
        //wid loading page opn url
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        date_time(driver,"date");//calling static method passing arg as driver n date(String)
        
        WebElement already_acclink=driver.findElement(By.xpath("//a[contains(text(),'Already')]"));
        already_acclink.click();
       
        date_time(driver,"date");
        
        
	}

}
