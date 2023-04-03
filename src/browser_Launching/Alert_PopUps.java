package browser_Launching;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_PopUps
{
	//screenshot code
     public static void viewScreenshot(WebDriver driver,String datetime)throws IOException
     {
    	 Date d=new Date();
    	 datetime=d.toString().replace(":","_").replace(":","_");
    			 
    	 TakesScreenshot ts=(TakesScreenshot)driver;
    	 File src=ts.getScreenshotAs(OutputType.FILE);
    	 File dest=new File("D:\\Screenshot_Sele\\screen"+datetime+".png");
    	 FileHandler.copy(src, dest);
    	
     }
	
	
	
	
	public static void main(String[] args) throws InterruptedException,IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.facebook.com/signup");//pass string as arg return void method of webdriver
        //wid loading page opn url
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://nxtgenaiacademy.com/alertandpopup/ ");
        //1.code for 1website
      /*
          driver.get("https://demoqa.com/alerts");
         driver.findElement(By.xpath("//button[text()='Click me'and @id='promtButton']")).click();
        
      Alert alt=driver.switchTo().alert();//switch focus//method chainig
        String text=alt.getText();//to send the text in input file
        alt.sendKeys("prajakta1234");
        //alt.dismiss();//it will cancel the alert
        //alt.accept();//it will accept alert
        Thread.sleep(3000);
        alt.accept();
        System.out.println(text);*/
       
       /* driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]")).clear();
        InvalidElementStateException for above elem*/
        
        
     
        //2.code for 2nd website
        
      /*  driver.get("https://nxtgenaiacademy.com/alertandpopup/ ");
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
       // viewScreenshot(driver,"datetime");//UnhandledAlertException
        Alert al=driver.switchTo().alert();
       
        String s=al.getText();
        System.out.println(s);
        Thread.sleep(3000);
      
        al.sendKeys("Yes");
        
        al.accept();*/
       
        //cant take screenshot of alert.
        
        
        
       //3.code for 3rd website
        
        /*  driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("praju123@g");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
       
        Alert al=driver.switchTo().alert();
        String txt=al.getText();
        System.out.println(txt);
       // al.accept();
        al.dismiss();
       // Thread.sleep(1000);
       /* String txt2=al.getText();
        System.out.println(txt2);
        Thread.sleep(1000);
        al.accept();*/
        
      /*  //4.Code for Scroll-up-down window////div[@class='menu']//a[text()='Python Lists']
        
     // driver.findElement(By.xpath(")//button[contains(@type,'button')]")).click();
        driver.get("https://nxtgenaiacademy.com/python/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(3000);
       WebElement number= driver.findElement(By.xpath("//div[@class='menu']//a[text()='Python Numbers']"));
       
       js.executeScript("arguments[0].scrollIntoview(true);",number);
        
        
        */
        
        //5 
        
        
        /*popups:->
         * small n separate window which will be dispalyed on users action
         * 
         * Types of popups
         * 1.hidden popups//ex:fb sign up page behind hidden lig in page 
         * 2.Alert popups
         * 3.child browser popups/window popups
         * 4.file upload-popups
         * 5.file download popups
         * 6.authentication popups
         * 
         * Alert(Interface)-->selenium packg//cannot inspect ele through the selenium
         * ;->small dialogue message box displays an imp notification on the screen
         * to give users a certain kind of info or ask for permission to perform a certain kind
         * of operation
         * 
         *****methods of alert******
         *1.dismiss():->return void//use to cancel 
         *2.accept():->return void//used to click on ok
         *3 getText():->return text//to get the text present on alert meassage box
         *4.sendKeys():->return void//arg(String stringToSend)//to send input data in alert box
         *switchTo():->return TargetLocator//method webdriver
         *alert():->return alert//method TargetLocator
         *Alert alt=driver.switchTo().alert();
         *meaning of above line -->
         *method return an obj of alert for alert box displayed on the screen
         *
         
         *1. Javascript Pop up :
This pop up is subdivided into below mentioned 3 pop ups.
1. Alert pop up
2. Confirmation pop up
3. Prompt pop up
1. Alert Pop up :
Characteristics features :
● We can’t inspect this pop up.
● We can’t move this kind pop up.
● This pop up will have white color background with black color font.
● This pop up will have only one “OK” button
How to handle Alert pop up
In order to handle the alert pop up, we first have to switch to alert window using the below
statement.
driver.switchTo().alert();
After transferring the control to alert window, we can use the following methods of
“Alert” interface.
getText() → to get the text present on the alert window.
accept() / dismiss() → to click on OK button on the alert window.
2. Confirmation Pop up :
Characteristics features :
● We can’t inspect this pop up.
● We can’t move this kind pop up.
● This pop up will have white color background with black color font.
● This pop up will have two buttons :- “OK” button and “Cancel” button.
How to handle Prompt Alert pop up
● In order to handle the alert pop up, we first have to switch to alert window using the below
statement.
driver.switchTo().alert();
● After transferring the control to alert window, we can use the following methods of “Alert”
interface.
getText() → to get the text present on the alert window.
sendKeys() → to enter a text in the textbox on the alert window.
accept() → to click on “OK” button on the alert window.
dismiss() → to click on “Cancel” button on the alert window
         *
         */

	}

}
