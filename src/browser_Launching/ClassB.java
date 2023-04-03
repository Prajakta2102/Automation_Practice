package browser_Launching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class ClassB 
{

public static void main(String[] args)throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	
	/*WebElement userid = driver.findElement(By.name("username"));
	userid.sendKeys("prajakta123");
	 
	Thread.sleep(3000);
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("647rghg");
	
	// Thread.sleep(3000);
	WebElement logbutton=driver.findElement(By.className("_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm"));
    logbutton.click();
    */
    String title=driver.getTitle();
    System.out.println(title);
    
    if(title.equals("Login • Instagram"))
    {
    	System.out.println("title is same");
    	
    }
    else
    {
    	System.out.println("title is different");
    	
    }

}

}
