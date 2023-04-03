 package browser_Launching;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_WindowPopups 
{

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        
        Thread.sleep(3000);
       
       WebElement AlertB= driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself ')])[1]"));//1st child window
       WebElement ConfirmB= driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself ')])[2]"));//2st child window
       WebElement  promptB= driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself ')])[3]"));//3st child window
       WebElement LinkBreak= driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself ')])[4]"));//4st child window
        
        
        AlertB.click();//4 child window
       // Thread.sleep(20000);
        ConfirmB.click();//3 child window
       // Thread.sleep(20000);
        promptB.click();//2 child window
      // Thread.sleep(20000);
        LinkBreak.click();//1 child window
      // Thread.sleep(10000);
        Thread.sleep(3000);
        
        
        //code for single(parent) n multiple(child) window handling
        String add=driver.getWindowHandle();//opn current window(parent)//o/p->main window
        System.out.println("Address of main(parent)window"+add);
        //Thread.sleep(3000);
        ArrayList<String>address=new ArrayList<String>(driver.getWindowHandles());//handles multiple child window(including parent(main) window) so we pass SET type of data in List type by creating Arraylist
        //which is type of list n concept of generic ..
         
        /*method ->ArrayList ,return->String,arg->index
         storing address of child window including parent window(using for loop for calling multiple child window) */
       /*  String address0= address.get(0);//address of main (parent) window
         String address1=address.get(1);//address of 2nd child window
         String address2=address.get(2);//address of 3rd child window
         String address3=address.get(3);//address of 4th child window
        
         */
        
        /* using for loop for calling multiple child window including parent window*/
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
         
        
      
        //CODE 2:->
 /*       
     List<WebElement> child_Browser=driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself ')]"));
      int popups_box=  child_Browser.size();//total child browser(total no .of links of child browser)
      System.out.println( popups_box);
      
       for(int i=0;i<popups_box;i++)
        {
    	   
    	  WebElement popups= child_Browser.get(i);
      	 System.out.println(popups.getText());
      	 popups.click();
      	 Thread.sleep(500);
      //	String url=driver.getCurrentUrl();
   	   // System.out.println(popups+": "+url+i);
        }
      	// String address_window=address.get(i);
    	// driver.switchTo().window(address_window);
      	 // String popups_window=address.get(i);
      	 //driver.switchTo().window(popups_window);
      	
      	*/
        
         
        
        
        
        
        //OUTPUT will get in reverse index order..  
        /*why collection we use?
         * we want to store multiple child window with specific index this is not possible in array
         * .so we go wid collection as set not allow duplicate and list take index of ele 
         * wid commom property i.e->size is growable.
        
         *  why we use generic(concept of collection)? :->cz it give specific type of datatype like string type ,int type .
	      why we use ArrayList?:->cz we are taking multiple no of data..no fix size
	      so we pass  as arg "getWindowHandles()" this method of Set.
	      this is reln we derived here bet List n Set in collection.*/
	
        
        

}
}
/*1. when we work on webpage of  browser ,we performing some action on their n due to this another/multiple new window get open
 * on browser .this is child window of current browser  
 * 2.in case of,alert popuups cn opn only one alert popups..we cannot click anyware
 * 3.so we give address to that child window..we cn identify to them
 * 4.switchTo() method will switch focus to that child window like switch focus on alert popups. 
 * 5.here,switchTo() method will focuse that window(child)n pass arg as address of that child window
 * so that it will uniquly identify d child window due o the address
 * two methods of WebDriver to get address
 * 1.getWindowHandle()-->return String-->it will give address of one window that is parent window
 *  2.getWindowHandles()-->return set<String>-->it will give address of multiple window that is child window including parents window  
 * 
 * *********COLLECTION*******************reason of using collection here************
 * 1.size is not fix here..mutiple window may be opn..so we cnnot use array as it is nt growable in nature.
 * so that we use COLLECTION here.as it is growable..cn add multiple child window
 * 2.DATATYPE:-
 * a.LIST:-
 * 1.can add multiple data but having an index n having sequence
 * 2.Duplicate ele allow
 * 3.cn add multiple data
 *
 * b.SET:-
 * 1.collection of multiple data without having an index..but not having sequence
 * 2.Duplicate ele r not allow
 * 3.3.cn add multiple data
 * 
 * so we r using SET here..bt it not allow sequential 
 * so we r also using list..i.e.arraylist(type of list hving property of list n array)
 * ArrayList<String>-->list of string-->
 * make obj of ArrayList(no fix size) n pass data (pass set)..so we get sequential data n no duplicate data
 * both property list n set
 * storing string in SET in ArrayList in specific index as we pass data as String set-->reln bet list n set
 * tell to collection that want 1 type of data in arraylists-->so use generics
 * collection -->generic concept-->one type of data only..like string stringtype,int only inttype
 * 
 *Child Browser Pop up:
Characteristic features :
● We can move this pop up.
● We can also inspect it.
● this pop up is very colorful and will have both minimise and maximise buttons.
How to handle Child browser pop up ?
● We handle child browser popup by using getWindowHandle() and getWindowHandles() methods of
WebDriver interface.
● In Selenium, every browser will have an unique window handle id.
● In firefox browser, window handle is an integer value, whereas in Chrome browser, it is an unique alpha
numeric string.
Difference between getWindowHandle() and getWindowHandles() ?
● getWindowHandle() returns the window handle id of the current browser window.
● getWindowHandles() returns the window handle id of all the browser windows */
