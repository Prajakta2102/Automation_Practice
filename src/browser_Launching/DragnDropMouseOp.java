package browser_Launching;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

public class DragnDropMouseOp 
{

	public static void main(String[] args)throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
				
        driver.manage().window().maximize();
        WebElement dragable=driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act=new Actions(driver);//obj of Actions class
        act.dragAndDrop(dragable, droppable).perform();//method of Actions class
        //dragAndDrop(WebElement source,WebElement dest)-->return Actions class-->to perform drag and drop opern
        

        
        
        /*simple 1.click()-->method-->Actions(c)--> opern will not work so use with moveToElement().(diff from method of webele click())
         *2.moveToElement(webele ref)'--> method-->Actions(c)-->arg=(webele ref)-->use->to move d ptr to specific ele
        3.build()-->method -->Actions-->return=Action(i)in java-->use-->combine d multiple mouse actions on single ele
        4.perform()-->method-->Actions-->return=void-->use-->to execute each given action of actions class
        5.contextClick-->method-->Actions-->void-->less use perform right click oper of the mouse.
        6.doubleClick();method-->Actions-->void-->less use to perform double click
       *
       */
        
        
        
        
        
        //to perform mouse action we need Actions class
        
        WebElement minitvlink = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
       // act.contextClick().perform();
      
       
       // act.moveToElement(minitvlink).doubleClick().build().perform();//doubleclick
        
        
        
      //  Actions act=new Actions(driver);//create obj n pass ref of  webdriver
         /*Actions is class present in org.openqa.selenium.interactions.Actions wid nonstatic method;
          //Action is interface in java-->method perform() */
         
        /*    act.moveToElement(acclistlink).perform();
       
          WebElement youraccountlink=driver.findElement(By.xpath("//span[text()='Your Account'] "));
          
          act.moveToElement(youraccountlink).click().build().perform();
        
          
          //Thread.sleep(3000);
          WebElement yourorderlink=driver.findElement(By.xpath(" //span[text()='Your Orders']"));
          act.moveToElement(yourorderlink).perform();
          Thread.sleep(3000);
          act.moveToElement(yourorderlink).click().build().perform();
          
          //act.moveToElement(minitvlink).click().build().perform();//method-->Actions(c)-->return=Actions(c)//to perform click oper on mouse
         
         /*simple click() ope will not work so use ,moveToElement().
          * 1'moveToElement(acclist)'--> method-->Actions(c)-->arg=(webele ref)--
         2.build()-->method -->Actions-->return=Action(i)in java-->use-->combine d multiple mouse actions on single ele
         3.perform()-->method-->Actions-->return=void-->use-->to execute each given action of actions class
        */
	
	
	
	
	}



	}


