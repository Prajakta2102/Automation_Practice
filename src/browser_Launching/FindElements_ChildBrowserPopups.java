package browser_Launching;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_ChildBrowserPopups 
{

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        
        Thread.sleep(3000);

        List<WebElement> child_Browser=driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself ')]"));
        int popups_box=  child_Browser.size();//total child browser(total no .of links of child browser)
        System.out.println( popups_box);
        
         for(int i=0;i<popups_box;i++)
          {
      	   
        	 child_Browser.get(i).click();
        	 Thread.sleep(1000);
        	 /*WebElement popups=  child_Browser.get(i);
        	 System.out.println(popups.getText());
        	 popups.click();*/
        	
          }
         String add=driver.getWindowHandle();//opn current window(parent)//o/p->main window
         System.out.println("Address of main(parent)window"+add);
         ArrayList<String>address=new ArrayList<String>(driver.getWindowHandles());
         for(int i=0;i<address.size();i++)//size()-->method of Arraylist
         {
        	 String address_window=address.get(i);
        	 Thread.sleep(500);
        	 driver.switchTo().window(address_window);//switch focus
        	 //Thread.sleep(10000);
        	 String URL=driver.getCurrentUrl();
        	 System.out.println(address_window+": "+URL);
        	 System.out.println();
         }
	}

}
