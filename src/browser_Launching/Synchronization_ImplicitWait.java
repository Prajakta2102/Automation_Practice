package browser_Launching;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_ImplicitWait 
{
 
	
	
	public static void main(String[] args) throws InterruptedException
	{

     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.w3schools.com/html/html_tables.asp");
        
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
    String Btn_txt=driver.findElement(By.xpath("//a[text()='Log in']/parent::div")).getText();
    System.out.println(Btn_txt);
    
    String company_name=driver.findElement(By.xpath("//td[text()='Maria Anders']//preceding-sibling::td")).getText();
    System.out.println(company_name);

    String GetCertifiedbtn_txt=driver.findElement(By.xpath("//a[contains(text(),'Get Certified')][1]")).getText();
    System.out.println(GetCertifiedbtn_txt);
	
	}

}

//a[text()='Log in']/parent::div
//td[text()='Maria Anders']//preceding-sibling::td
//a[contains(text(),'Get Certified')][1]

/* Synchronization:-
1.matching code speed execution(testscript running speed) with appl speed/browser speed.

2.to achieve it we used wait in selenium.

a]implicit Wait:-
-when we know the exact time taken by the browser /webpage to loads its contents.
- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
manage()->return options
timeouts()->return timeouts->method Options
implicitlyWait->return timeouts->method timeouts->arg(Duration duration)-->Duration class->ofSecond method of Dursation(c)

-it applicable for 1st time only and whole webpage.
-it will wait to instruct webdriver to wait for certain time before throwing NOSuchElementException.
*/