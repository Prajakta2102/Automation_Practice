package browser_Launching;
import java.io.File;//File class
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
public class TakesScreenshotpro 
{
     static int i=0;
	 public static void captureScreenshot(WebDriver driver)throws InterruptedException,IOException 
	 {
		 
		
		//Thread.sleep(3000);
			                                                                       //TakesScreenshot t= (TakesScreenshot)driver;
	   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //
	   File dest=new File("D:\\Screenshot_Sele\\screen"+ i +".png");
	   FileHandler.copy(source, dest);
		i++;
	  }
	
     public static void main(String[] args) throws InterruptedException, IOException  
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup");//pass string as arg return void method of webdriver
        //wid loading page opn url
        driver.manage().window().maximize();
        Thread.sleep(3000);
      
        captureScreenshot(driver);
         WebElement already_acclink=driver.findElement(By.xpath("//a[contains(text(),'Already')]"));
        already_acclink.click();
        
        captureScreenshot(driver);
         //
        WebElement forgot_pw=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
        forgot_pw.click();
       
        captureScreenshot(driver);
        
        System.out.println("Hello ,GIT");
        
        
        /*TakesScreenshot-->interface in selenium pkg
         * 1.getScreenshotAs(A)-->abstract method of TakesScreenshot(i)
         * returntype OutputType<X>-->return X-->FILE
         * 2. OutputType(I)is interface hving  Static and Final method like FILE,BYTES and abstract method like convertFromBase64Png(String)
         *///
       
          /*TakesScreenshot t= (TakesScreenshot)driver;//upacast(implicit casting)
           t.getScreenshotAs(null);
           ((TakesScreenshot)driver).getScreenshotAs(Output.FILE);
        
           1.declaration of abstract method ( getScreenshotAs())-->TakesScreenshot(I)
           2.implementation of abstract method -->ChromeDriver(Imp C) ( getScreenshotAs())-->driver(new ChromeDriver();/
           obj /calling constructor/)
           3.getScreenshotAs() abstract method-->as arg->OutputType(I)-->FILE is static n final method pf OutputType(I)
           4.store that output(Screenshot format) somewhere in sm like (file,img,byte ,etc) format 
           ,so passing as arg (OutputType.FILE) to getScreenshotAs(A) method of TakesScreenshot(I) implementing by chromedriver
           5.(OutputType.FILE)-->binary data converting in output to readable format (FILE) 
           6.getScreenshotAs(A)-->returntype-->File java(C)(OutputType)(storing val in that format)
           7.FILE is method and File is java class both diff
           */ 
            
           /*File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //File dest= new File("D:\\Screenshot_Sele");//create only dest refvar pass copied path folder name(dest give to file)
           File dest= new File("D:\\Screenshot_Sele\\screen"+i+".png");//ech time name will be new to screenshot.
            //FileHandler  -->copied data from source to dest--> copy java memory to system(our desktop)
           FileHandler.copy(source, dest);
           i++;*///not ovverride screnshot
           
           /*FILE is class available in java n store source var in datatype FILE java class
            1. source code store in java memory
            2. to save screenshot from source (java) to smwhere in our system-->dest var
            3.dest -->path of file(screenshot)as arg
            4.to create a obj of file java class n pass arg as path where it is stored
            5.FileHandler is class in sele.io pckg. it hs diff methods to perform operation on file class of java 
            6.copy is static method of filehandler class --> copy data from sourse to dest -->return void -->arg 2-->file(from where we copy),file(where to paste) 
            7"screen.png"(new file)-->name of screenshot  stored in file so give name .extension(png) where it saved 
            8.IOException is i/p ,o/p exception when we copy data from java memory to system agrred dat exception 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* WebElement already_acclink=driver.findElement(By.xpath("//a[contains(text(),'Already')]"));
        already_acclink.click();*/
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
