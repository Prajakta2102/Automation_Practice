


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Mock 
{
public static void screenshot(WebDriver driver,String date)throws IOException
{
Date d=new Date();
date=d.toString().replace(":","_").replace(":","_");
TakesScreenshot ts= (TakesScreenshot)driver;
File src= ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Screenshot_Sele\\screen."+date+".png");
FileHandler.copy(src,dest);
}


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		ChromeOptions p=new ChromeOptions();
	      p.addArguments("--remote-allow-origins=*");
	   WebDriver driver=new ChromeDriver(p);
	
     // WebDriver driver=new ChromeDriver();
   //  driver.get("https://www.w3schools.com/html/html_tables.asp");
       // Thread.sleep(3000);
        
       // driver.get("https://www.amazon.in ");
        
    /* List<WebElement>alllinks=driver.findElements(By.xpath("//div[@id='nav-xshop-container']"));
     int no_oflinks=alllinks.size();
    // System.out.println(no_oflinks);
		for(int i=0;i<alllinks.size();i++)
		{
			/*WebElement a=alllinks.get(i);
			String s=a.getText();
			System.out.println(s);
			a.click();*/
		//System.out.println(alllinks.get(i).getText());
		//alllinks.get(i).click();
		//}

		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(//div[@data-category='goldbox'])));*/
		
			/*	List<WebElement>deals=driver.findElements(By.xpath("//div[@data-category='goldbox']"));
        int deal=deals.size();
        System.out.println(deal);
        for(int i=0;i<deals.size();i++)
        {
        WebElement a=deals.get(i);
        System.out.println(a.getText());
        }
        */
		/*driver.get("https://m.cricbuzz.com/cricket-series/4840/icc-womens-t20-world-cup-2023/points-table");
        List<WebElement>data=driver.findElements(By.xpath("//table[@class='table']//td[1]"));
        for(int i=0;i<data.size();i++)
        {
        WebElement a=data.get(i);
        System.out.println(a.getText());
        }*/
     
        /*  driver.get("https://chimesradio.com/parenting-blogs/states-and-capitals-of-india");
        List<WebElement>capitaldata=driver.findElements(By.xpath("//div[@data-id='d2c0b75']//tr[3]//td[3]"));
        int data=capitaldata.size();
        System.out.println(data);
        for(int i=0;i<data;i++)
        {
        WebElement a=capitaldata.get(i);
        System.out.println(a.getText());
        }*/
     // driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
       /* WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Alert']")));
        WebElement alert=driver.findElement(By.xpath("//input[@value='Alert']"));
        alert.click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        */
    /*  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='confirmation']")));
        WebElement confirm=driver.findElement(By.xpath("//input[@name='confirmation']"));
        confirm.click();
        Alert al1=driver.switchTo().alert();
        System.out.println(al1.getText());
        al1.accept();*/
        
       /* WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='prompt']")));
        WebElement prompt=driver.findElement(By.xpath("//input[@name='prompt']"));
        prompt.click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.sendKeys("praju");
        al.accept();
       
        */
        
       // driver.get("https://www.w3schools.com/js/js_popup.asp");
       /* WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
 	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='w3-btn w3-margin-bottom']")));*/
     /*  List< WebElement> childwindow=driver.findElements(By.xpath("//a[@class='w3-btn w3-margin-bottom']"));
       for(int i=0;i<childwindow.size();i++)
       {
    	   childwindow.get(i).click();
    	  
       }
       String mainwindowadd=driver.getWindowHandle();
       System.out.println(mainwindowadd);
       ArrayList<String>childwindowadd=new ArrayList<String>(driver.getWindowHandles());
       for(int i=0;i<childwindowadd.size();i++)
       {
    	   String childad=childwindowadd.get(i);
    	   driver.switchTo().window(childad);
    	  Thread.sleep(500);
    	   String url=driver.getCurrentUrl();
    	   System.out.println(url);
       }
       */
     //   driver.get("https://www.w3schools.com");
       /*List<WebElement>tab=driver.findElements(By.xpath("//a[@class='w3-button tryit-button']"));
       for(int i=0;i<tab.size();i++)
       {
       tab.get(i).click();
       }
       String mainwindow=driver.getWindowHandle();
       System.out.println(mainwindow);
       ArrayList<String>childwin=new ArrayList<String>(driver.getWindowHandles());
       for(int i=0;i<childwin.size();i++)
       {
    	   String childwinad=childwin.get(i);
         driver.switchTo().window(childwinad);
         String url=driver.getCurrentUrl();
          System.out.println(url);
       }*/
       // driver.get("https://www.w3schools.com/css/css_margin.asp");
      /*  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='w3-btn']")));
       List<WebElement>ad=driver.findElements(By.xpath("//a[@class='w3-btn']"));
       for(int i=0;i<ad.size();i++)
       {
       ad.get(i).click();
       }
       String adwin=driver.getWindowHandle();
       System.out.println(adwin);
       ArrayList<String>childad=new ArrayList<String>(driver.getWindowHandles());
       for(int i=0;i<childad.size();i++)
       {
       String s=childad.get(i);
       driver.switchTo().window(s);
       Thread.sleep(500);
       String url=driver.getCurrentUrl();
       System.out.println(url);
       }*/
        
       /* List<WebElement>ad=driver.findElements(By.xpath("//a[@class='w3-btn w3-margin-bottom']"));
        for(int i=0;i<ad.size();i++)
        {
        	ad.get(i).click();
        }
        String mad=driver.getWindowHandle();
        System.out.println(mad);
        ArrayList<String>childad=new ArrayList<String>(driver.getWindowHandles());
        for(int i=0;i<childad.size();i++)
        {
        	String cad=childad.get(i);
        	driver.switchTo().window(cad);
        	String url=driver.getCurrentUrl();
        	System.out.println(url);
        	String title=driver.getTitle();
        	System.out.println(title);
        	if(!mad.equals(cad))//closed child tab//mad.equals(cad-->close parent tab only
        	{
        		driver.close();
        	}
        }*/
        
/*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe_frameborder_css");
WebElement frame=driver.findElement(By.xpath("\\iframe[@name='cnftComm']"));
driver.switchTo().frame(0);
WebElement iframel=driver.findElement(By.xpath("//a[@id='navbtn_menu'][1]"));
iframel.click();
System.out.println(iframel.getText());
//iframel.click();
driver.switchTo().defaultContent();//
//WebElement runbtn=driver.findElement(By.xpath("//a[@id='w3loginbtn']"));


//runbtn.click();
      //driver.quit();*/
      /*  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        WebElement framele=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(framele);
        WebElement framelebtn=driver.findElement(By.xpath("//button[text()='Try it']"));
        framelebtn.click();
        Alert al=driver.switchTo().alert();
        String s=al.getText();
        System.out.println(s);
        al.accept();
        
        driver.switchTo().defaultContent();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menuButton']")));
        WebElement changethemebtn=driver.findElement(By.xpath("//a[@id='menuButton']"));
       // changethemebtn.click();	
       // Select sl=new Select(changethemebtn);
        Actions a=new Actions(driver);
        a.moveToElement(changethemebtn).perform();
        a.moveToElement(changethemebtn).click().build().perform();
       WebElement Orientation=driver.findElement(By.xpath("//span[text()='Change Orientation']"));
        a.moveToElement(Orientation).click().build().perform();
      //  sl.selectByVisibleText("Change Orientation");
        */
       // driver.get("https://www.w3schools.com/js/js_popup.asp");
      /* List<WebElement>btn=driver.findElements(By.xpath("//a[@class='w3-bar-item w3-button']"));
        int totallink=btn.size();
        System.out.println(totallink);
        for(int i=0;i<btn.size();i++)
        {
      WebElement z=  btn.get(i);
        String x=z.getText();
        System.out.println(x);
        }
*/
        /*
List<WebElement>btns=driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
for(int i=0;i<btns.size();i++)
{
WebElement btn= btns.get(i);
btn.click();
String btntext=btn.getText();
System.out.println(btntext);
}
String a=driver.getWindowHandle();
System.out.println(a);
ArrayList<String>ad=new ArrayList<String>(driver.getWindowHandles());
for(int i=0;i<ad.size();i++)
{
	String d=ad.get(i);
  driver.switchTo().window(d);
  String b=driver.getCurrentUrl();
System.out.println(b);
}
*/
      /*  driver.get("https://www.w3schools.com/js/js_comments.asp");
List<WebElement>btn=driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
for(int i=0;i<btn.size();i++)
{
  WebElement b1=btn.get(i);
String textbtn=b1.getText();
b1.click();
}
String s=driver.getWindowHandle();
System.out.println(s);
ArrayList<String>ad=new ArrayList<String>(driver.getWindowHandles());
for(int i=0;i<ad.size();i++)
{
 String s1=ad.get(i);
driver.switchTo().window(s1);
String url=driver.getCurrentUrl();
System.out.println(url);
}*/
       // driver.get("https://www.w3schools.com/html/html_tables.asp");

/*List<WebElement>data=driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
for(int i=0;i<data.size();i++)
{
WebElement s=data.get(i);
String txt=s.getText();
System.out.println(txt);
}*/
        /*WebElement data=driver.findElement(By.xpath ("//a[text()='Try it Yourself »'][1]"));
        JavascriptExecutor jv=(  JavascriptExecutor )driver;
        jv.executeScript("arguments[0].scrollIntoView(true);",data);*/
        
       /*driver.get("https://www.softwaretestingmaterial.com/how-to-skip-testng-test");
    WebElement dis=driver.findElement(By.xpath(" //button[text()='Cancel']"));
      dis.click(); */
     // driver.get("https://demoqa.com/frames");
     /*  WebElement alertbtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
       alertbtn.click();
      Alert a=driver.switchTo().alert();
      System.out.println(a.getText());
      a.dismiss();
        
      List<WebElement> btn=driver.findElements(By.xpath("//button[@type='button']"));

      int nobtn=btn.size();
      System.out.println(nobtn);
      for(int i=0;i<btn.size();i++)
      {

      WebElement b=btn.get(i);
      String textbtn=b.getText();
      System.out.println(textbtn);
      }*/
     // driver.get("https://www.myntra.com");
     /* List<WebElement> btn=driver.findElements(By.xpath("//div[@tabindex='0']"));
      int b=btn.size();
      System.out.println(b);
      for(int i=0;i<b;i++)
      {
      WebElement a=btn.get(i);
      String text=a.getText();
      System.out.println(text);
      } */

/*List<WebElement>img=driver.findElements(By.xpath("//a[@data-type='navElements']"));
int b=img.size();
System.out.println(b);
for(int i=0;i<b;i++)
{
WebElement x= img.get(i);
String m=x.getText();
System.out.println(m);
}
*/
     // System.setProperty("WebDriver.gecko.driver","D:\\Driver\\geckodriver.exe");
     // WebDriver driver=new FirefoxDriver();
     // driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
    /*  Thread.sleep(500);
     WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
     // int a=droplist.size();

      Select s=new Select(dropdown);
      if(dropdown.isEnabled())
      {
      System.out.println("enabled");
      }
      if(dropdown.isDisplayed())
      {
      System.out.println(dropdown.isDisplayed()+" "+"Displayed");
      }
      s.selectByVisibleText("India");
   if(dropdown.isSelected())
      {
	   String a=dropdown.getText();
	   System.out.println(a);
      System.out.println(dropdown.isSelected());
      
      }
  
   String v=s.getFirstSelectedOption().getText();
   System.out.println(v);
  List< WebElement>dropdown1=driver.findElements(By.xpath("//select[@name='country']"));
      int listsize=s.getOptions().size();
    System.out.println(listsize);
 
    WebElement o=driver.findElement(By.xpath("//select[@name='Month']"));
    Select s1=new Select(o);
    s1.selectByIndex(2);
    int no=s1.getOptions().size();
    System.out.println(no);
   /* JavascriptExecutor j=(JavascriptExecutor)driver;
    j.executeScript("arguments[0].scrollIntoView(true);",o);*/
 /* for(int i=0;i<dropdown1.size();i++)
  {
	  WebElement e= dropdown1.get(i);
	  String st=e.getText();
	  System.out.println(st);
  }
  s1.deselectByVisibleText("February");//
 // s.selectByIndex(2);
 /* driver.get(" https://selenium08.blogspot.com/2019/07/alert-test.html");

  WebElement salert=driver.findElement(By.xpath("//input[@id='simple']"));
  salert.click();
  Alert a=driver.switchTo().alert();
  a.getText();
  System.out.println(a.getText()); 
  a.accept();
    
  WebElement prompt=driver.findElement(By.xpath("//button[@id='prompt']"));
  prompt .click();
  Alert a1=driver.switchTo().alert();
  a1.sendKeys(" praju");
  a1.getText();
  System.out.println(a1.getText()); 
  a1.accept();
  */
  //driver.get("https://selenium08.blogspot.com/2020/01/drag-me");
  /*WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
   Actions a=new Actions(driver);
   a.moveToElement(gmail).perform();
   a.moveToElement(gmail).click().build().perform();*/
         
	   /* driver.get("https://www.goibibo.com");    
	  List <WebElement> link=driver.findElements(By.xpath("//a[@class='nav-link .']"));
	        int a=link.size();
	        System.out.println(a);
	      for(int i=0;i<link.size();i++)
	      {
	    	  WebElement l=link.get(i);
	    	  String txt=l.getText();
	    	  System.out.println(txt);
  
	      }*/////div[@role='treeitem']
	      
       // driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	   driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1679656146");
     /*  List< WebElement>l=driver.findElements(By.xpath("//select[@title='Search in']"));//
       int j=l.size();
       System.out.println(j);
       
       for(int i=0;i<l.size();i++)
       {
    	 WebElement o=l.get(i);
    	 String txt=o.getText();
    	  System.out.println(txt);
       }*/
     /*  List<WebElement>cell=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
       int no=cell.size();
       System.out.println(no);
       for(int i=0;i<cell.size();i++)
       {
    	   WebElement s=cell.get(i);
    	   String str=s.getText();
    	   System.out.println(str);
       
       }*/
	 //  driver.get("https://www.google.com/search?q=ipl+schedule&oq=ipl+&aqs=chrome.3.69i57j0i131i433i512l9.4502j0j15&sourceid=chrome&ie=UTF-8#sie=lg;/g/11q99yy05p;5;/m/03b_lm1;st;fp;1;;;");
	   /*List<WebElement>table=driver.findElements(By.xpath("//div[@jsname='ibnC6b']"));
	   int t=table.size();
	   System.out.println(t);
	   Select s=new Select(table);
	   
       for(int i=0;i<table.size();i++)
       {
    	   WebElement x=table.get(i);
    	   String s=x.getText();
    	   System.out.println(s);
       }*/
	/*   WebElement table=driver.findElement(By.xpath("//div[@jsname='ibnC6b']"));
       Select s=new Select(table);
      int d= s.getOptions().size();
      System.out.println(d);
    */
	   ////div[@id='nav-xshop-container']
	  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  // driver.get("https://www.amazon.in");//
	  // Thread.sleep(500);
	 /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-a  ']")));
	 List< WebElement>link=driver.findElements(By.xpath("//a[@class='nav-a  ']"));
	
	int allink=link.size();
	System.out.println(allink);
	
	for(int i=0;i<link.size();i++)
	{
		//link.get(i).click();
		
		Thread.sleep(500);
		
		WebElement l=link.get(i);
		
	String text=l.getText();
	System.out.println(text);
	l.sendKeys(Keys.CONTROL,Keys.ENTER);
		Thread.sleep(500);
		
	}
	*/
	   driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	List<WebElement>li=driver.findElements(By.xpath("//div[@data-category='electronics']"));
	Thread.sleep(500);
	int total=li.size();
	System.out.println(total);
	for(int i=0;i<li.size();i++)
	{
		WebElement l=li.get(i);
		String text=l.getText();
		System.out.println(text);
		l.sendKeys(Keys.CONTROL,Keys.ENTER);
	/*	String t=Keys.chord(Keys.CONTROL,Keys.ENTER);//sendKeys(Keys.CONTROL,Keys.ENTER);
        l.sendKeys(t);*/
	}
	
	
	}

}
