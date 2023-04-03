package browser_Launching;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class HTML_Tables {
	
	//TakesScreenshotcode
	public static void viewscreenshot(WebDriver driver,String datetime)throws IOException
	{
		Date d=new Date();
		datetime=d.toString().replace(":","_").replace(";", "_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Screenshot_Sele\\screen"+datetime+".png");
		FileHandler.copy(src, dest);
	}

	public static void main(String[] args)throws InterruptedException ,IOException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        Thread.sleep(3000);
        
      /*  WebElement table_val5R=driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[3]"));
        table_val5R.click();
        String s=table_val5R.getText();
        System.out.println(s);
        
        WebElement table_val5R1=driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[1]"));
        table_val5R1.click();
        System.out.println(table_val5R1.getText());*/
        
       List<WebElement>table_Data=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
        int no_ofWebEle=table_Data.size();//howmany total no ele table contain-->18
        System.out.println(no_ofWebEle);
        
       for(int i=0;i<no_ofWebEle;i++)
        {
        	WebElement a1=table_Data.get(i);
        	System.out.println(a1.getText());
        }
        
        
        
        
        
        /*what is findElements() ?
● findElements() method return list of WeBelemnts is present in SearchContext interface, the super most interface in Selenium.
● findElements() identifies the elements on the webpage based on the locators used.
● It returns a list of webElements if it find the matching element.
● If it does not find any matching web element on the web page, it returns an empty lis

*
*
**what is findElement() ?
*
*findElement() method return WeBelement is present in SearchContext interface, the super most interface in Selenium.
● findElement() identifies the single element on the webpage based on the locators used.
*
*
*
*/
        
        /*  
        //JAVASCRIPTEXECUTOR SCROLLINTOVIEW METHOD CODE//
        WebElement table_val7R1=driver.findElement(By.xpath("//table[@id='customers']//tr[7]//td[2]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;//UPCASTING 
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView(true);", table_val7R1);
        System.out.println(table_val7R1.getText());
        
        //MOUSE HOVER CODE//
        WebElement changetheme =driver.findElement(By.xpath("//a[@onclick='changepagetheme(2)']"));
        Actions act=new Actions(driver);//OBJ OF CLASS PASSING REF AS ARG
        act.moveToElement(changetheme).perform();
        viewscreenshot(driver,"datetime");
        
        Thread.sleep(1000);
        WebElement darkmode =driver.findElement(By.xpath("//label[text()=' Dark code']//parent::div"));
        act.moveToElement(darkmode).click().build().perform();
        viewscreenshot(driver,"datetime");//calling sceenshot method
        act.moveToElement(changetheme).perform();
        
        //DRAG AND DROP MOUSE OP CODE//
        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        Actions a= new Actions(driver);
        WebElement dragele =driver.findElement(By.xpath("//div[@id='div1'and @ondrop='drop(event)'][1]"));
	    WebElement dropele=driver.findElement(By.xpath("//div[@id='div2'and @ondrop='drop(event)'][1]"));
	    a.dragAndDrop(dragele, dropele).perform();
	*/
	
	}

}
