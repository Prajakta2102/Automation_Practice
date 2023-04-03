package browser_Launching;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrollup_Scolldown_JscriptExecutor  
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://jqueryui.com");
		Thread.sleep(3000);////
		//JavascriptExecutor js = new ChromeDriver ();
		JavascriptExecutor js=(JavascriptExecutor)driver;//typecating//
        //JavascriptExecutor -->interface-->abstract methods-->import from Selenium-->to handle UI
	    WebElement showele=driver.findElement(By.xpath("//a[text()='Show']"));
	    js.executeScript("arguments[0].scrollIntoView(true);",showele );
	    //js is the ref--executeScript -->method of JavascriptExecutor(I)-->arg=(string script,ele ref)
	    //arguments is class -->take 0 as arg-->scrollIntoView(true)-->method of arguments-->arg=true/false val-->then only ele will be visible
	    Thread.sleep(3000);
	    driver.quit();*/
	    
	    /* How to perform scrollup n scrolldow oper//?
	     * to view the ele which we want to show that we use code of jscript ..
	     * method exceutescript is used to execute that jscript
	     * scrollIntoView use to scroll down.
	     */
		
		driver.get("https://github.com/cypress-io/cypress-realworld-app");
		JavascriptExecutor js=(JavascriptExecutor )driver;
		 WebElement node=driver.findElement(By.xpath("//a[text()='.node-version'and @title='.node-version']"));
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].scrollIntoView(true);",node);
		// js.executeScript("arguments[0].scrollIntoView(true);",getting);
		 Thread.sleep(3000);
	}

}
