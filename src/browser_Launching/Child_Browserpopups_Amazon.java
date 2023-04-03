package browser_Launching;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browserpopups_Amazon 
{

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        
        Thread.sleep(3000);
        
        WebElement seemore1=driver.findElement(By.xpath("//a[contains(text(),'See more')]//parent::div[1]"));
        seemore1. click();//
        
        Thread.sleep(1000);
      /*  WebElement emailid=driver.findElement(By.xpath("//input[@name='emailid'and @maxlength='50']"));
        emailid.sendKeys("kalmeghpraju123@gmail.com");//
        
        WebElement login=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        login.click();*/
        
        
      /*  String add=driver.getWindowHandle();
        System.out.println("Address of main(parent)window"+add);
        ArrayList<String>address=new ArrayList<String> (driver.getWindowHandles());
       */
        
       /* for(int i=0;i<address.size();i++)//size()-->method of Arraylist
        {
       	 String address_window=address.get(i);
       	 Thread.sleep(500);
       	 driver.switchTo().window(address_window);//switch focus
       	WebElement emailid=driver.findElement(By.xpath("//input[@name='emailid'and @maxlength='50']"));
        emailid.sendKeys("kalmeghpraju123@gmail.com");
       	 //Thread.sleep(10000);
       	 String URL=driver.getCurrentUrl();
       	 System.out.println(address_window+": "+URL);
       	 System.out.println();
        }*/
        
        
	}

}
