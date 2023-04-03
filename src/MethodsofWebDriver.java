
 


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	//import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	//import org.openqa.selenium.Dimension;
	//import org.openqa.selenium.OutputType;
	//import org.openqa.selenium.Point;
	//import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	//import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class MethodsofWebDriver 
	{
		/*2.how to take a screnshot by TakesScreenshot (i)
		
		public static void viewScreenshot(WebDriver driver,String datetime) throws IOException
		{
	      //TakesScreenshot ts=(TakesScreenshot)driver;//upcasting/implicit casting(premitive)
			Date d =new Date();
			datetime=d.toString().replace(":", "_").replace(" ","_" );
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//getScreenshotAs method of (TakesScreenshot) interface 
			File dest=new File("D:\\Screenshot_Sele\\screen"+ datetime+".png");//File class in java.io .File
		    FileHandler.copy(source, dest);//FileHnadler class selenium.io pckg
		
		}*/

	/*CSS selector ->we cannot navigate from child root to parent ..it only navigate parent to child
	 *Xpath:-  we cannot navigate from   parent	to child as well as child to parent
	 */
		
		public static void main(String[] args)throws InterruptedException,IOException
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.get("https://www.telerik.com/contact");
	       // Thread.sleep(3000);
	     
	      /*  String s=driver.getTitle();
	        System.out.println(s);
	        
	        String url=driver.getCurrentUrl();
	        System.out.println(url);
	        
	        driver.manage().window().maximize();
	        Dimension d=new Dimension(200,500);
	        driver.manage().window().setSize(d);
	        
	        Point p=new Point(600,200);
	        driver.manage().window().setPosition(p);
	        
	        driver.navigate().forward();
	        driver.navigate().back();
	        driver.navigate().refresh();
	       // driver.navigate().to("www.google.com");
	       // driver.close();
	       // driver.quit();*/
	       
	        //1.dropdownlist
	     /*   WebElement Selectopt=driver.findElement(By.xpath("//select[@name='DropdownListFieldController_0']"));
	        Select se = new Select(Selectopt);//obj of select class pass ref of web//org.openqa.selenium.support.ui.Select;(packg)
	        //method of select class
	        //se.selectByIndex(0);//void-arg(int index)
	       // se.selectByValue("");//void arg(string value)
	        se.selectByVisibleText("Account activation");//void//arg(string text)*/
	        
	        //2.how to take a screnshot by TakesScreenshot (i)
	       // viewScreenshot(driver,"datetime");
	        
	        
	        /*3.prameterization// reading data from external file to java memory
	         * HOw to fetch data from xl sheet?
	         * */
	        
	          /*String path="C:\\Users\\Prasad\\Desktop\\parameterization";
	          FileInputStream f=new FileInputStream(path);
	          String val=WorkbookFactory.create(f).getSheet(" velocity").getRow(0).getCell(1).getStringCellVal();
	          System.out.println(val);
	          */
			
			/*4 dragAndDrop operan
			 * //act.moveToElement(webele ref);
			 *act.perform();
			 *act.build();
			 *act.click();(we use perform ()and moveToelement(webele ref)
			 *act.doubleClickElement();
			 *act.contextClick();to perform right click opera
			 *act.dragAndDrop(dragable.droppable);
			 
			 
			WebElement drag=driver.findElement(By.xpath(""));
			WebElement drop=driver.findElement(By.xpath(""));
			Actions act= new Actions(driver);
			act.dragAndDrop(drag, drop).perform();*/
	        
	        /*5 Scroll up and Scroll Down
	        
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			WebElement elementname=driver.findElement(By.xpath(""));
			js.executeScript("argument[0].scrollIntoView(true);", webele ref name);
			*/
	      //a[@class='nav-link .']
	  
	      }
		}

	

