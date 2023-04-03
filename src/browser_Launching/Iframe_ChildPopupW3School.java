  package browser_Launching;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_ChildPopupW3School 
{

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself ')][1]")).click();
        
        ArrayList<String>address=new ArrayList<String>(driver.getWindowHandles());//all tab address
        driver.switchTo().window(address.get(1));//for address and switching focus on of 1st child window
	
      // driver.switchTo().frame(1);//switch to focus on frame(another page)by index
        //driver.switchTo().frame("iframeResult");//by id/name(overloaded method)
        
        Thread.sleep(1000);
        
       
       WebElement frameEle=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frameEle);//by passing arg WebEle frameEle//
        Thread.sleep(1000);
        WebElement trybtn=driver.findElement(By.xpath("//button[text()='Try it']"));//ele locate on iframe
        trybtn.click();////iframe[@id='iframeResult']
        
        Alert alt=driver.switchTo().alert();//switch to focus on alert popup
        Thread.sleep(500);
         alt.accept();//
      
         /*method of TargetLocator return webdriver*/
         driver.switchTo().defaultContent();//when direct switch(any child frame to main page)
         //driver.switchTo().parentFrame();//navigate frome child frame to its immidiate parent frame
         
        Thread.sleep(1000);
        WebElement runbtn= driver.findElement(By.xpath("//button[text()='Run ❯']"));//click on Run btn
        runbtn.click();//noSuchElementException
       
       //frame is overloaded method(with arg index,WebEle frameEle,id/classname of TargetLocator return WebElement 
        
        
        
        
          //driver.close();//UnhandledException
        
      
        
      
       
       
       /* Select s=new Select(Dropdown);//not working bcz select tagname is not present there
       s.selectByVisibleText("Change Theme, Dark/Light");*/
	}

}
