  package browser_Launching;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWait 
{

	public static void main(String[] args) 
	{

	     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.w3schools.com/html/html_tables.asp");
	      
	     
	     WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));//explicit wait
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log in']/parent::div")));
	     
	     

	    String Btn_txt=driver.findElement(By.xpath("//a[text()='Log in']/parent::div")).getText();
	    System.out.println(Btn_txt);
	    
	    String company_name=driver.findElement(By.xpath("//td[text()='Maria Anders']//preceding-sibling::td")).getText();
	    System.out.println(company_name);

	    String GetCertifiedbtn_txt=driver.findElement(By.xpath("//a[contains(text(),'Get Certified')][1]")).getText();
	    System.out.println(GetCertifiedbtn_txt);

	}

}


/*Explicit wait  for until the specific webele(heavy ele) completely loaded on that webpage..(best wait)  
 * ->related to specific ele it wait until it completely loaded otherwise give TimeoutException 
 * ->it will take constant 500ms time(std)
 * ->ExpectedConditions(class)Static method;->visibilityOfElementLocated */
