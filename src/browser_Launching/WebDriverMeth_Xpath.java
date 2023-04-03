  package browser_Launching;

import org.openqa.selenium.WebDriver;//importing WebDriver interface
//org.openqa.selenium. is packagename in selenium server jar present in Referenced libraries
//WebDriver is interface name

import org.openqa.selenium.chrome.ChromeDriver;
//org.openqa.selenium.chrome is package name in selenium server jar present in Referenced libraries
//ChromeDriver is Classname
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//Dimension is classname to used the different dimenetion for browser/window.

import org.openqa.selenium.Point;
//Point class is classname 

import org.openqa.selenium.WebElement;
//WebElement interface

public class WebDriverMeth_Xpath
{

	public static void main(String[] args) throws InterruptedException
	{
		//**************methods of webdriver and X-path************************** 
		//System is in built Class present in java.lang.package
		//setProperty is method of System class.(key (obj of chrome  driver with ref of webdriver interface
		//(path/value of chrome driver exe file)
		// setProperty method 2 attribute(propertyname(key),value(path))
        //propertyname-name of specific browser,key-path of that broweser driver
        //propertyname:-confingured chromedriver with webdriver
		
		//1
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");//(key,path(value))
        
		//doing upcasting
		WebDriver driver=new ChromeDriver();//WebDriver interface,driver is ref obj/ref var of interface 
         //new ChromeDriver is obj of Subclass (chrome) in which methods are override from
         //implementation class RemoteWebDriver(c).(launch chrome driver(browser)white window)
        //confingured chromedriver with webdriver
         
         //2
         driver.get("https://www.facebook.com/login/");
       //  driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&ifkv=AWnogHel69q5kMjpziQgaeNCh0Bvo08pUiT4wTixy8A92H_gLctwK03q3B0MzLCgZHpPgSeJGO5BNg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
         //get is WebDriver(Interface) method we can pass the url for opening url.
        // and wait till whole page will get loaded.
         
         
         //3
         Thread.sleep(3000);
         //Sleep method of Thread class is used to stop laoding that webpage
         //for smtime by passing second,min, hr or specific time.
         
         //4
         driver.manage().window().maximize();//method chaining
         //METHOD CHAINING
         //:-->we can change method with another method called as method chaining.
         //used to maximize the window
         //driver(ref od webdriver(I)),manage()(method of webdriver (I)which return Options(I)
         //Windows()(method of Options(I) which returns windows(I)
         //maximize method of Windows(I) which returns void
         //maximize method is used to max the complete(current browser) window
         //to view the complete web elelment on the webpage.
         
         //5
         //driver.manage().window().minimize();
         //minimize the window..it is desktop based selenium is webbased appl only browser)
          //driver(ref od webdriver(I)),manage()(method of webdriver (I)which return Options(I)
         //Windows()(method of Options(I) which returns windows(I)
         //maximize method of Windows(I) which returns void
         //minimize method is used to minimize the complete(current) window
         
        
         //5.1
         //set size of window/browser
         //a.1st we hv to create obj of Dimension class for using d properties(ht ,wd) of Dimension  class by an obj
         //import dimension class to provide diff dimensions whenever the size of browser get changes.
         //new dimension is para constructor passing the arg(width,ht(x,y))of window
        /* Dimension d=new Dimension(300,600);
         driver.manage().window().setSize(d);*///d is ref of dimenssion class
        //setSize method (window interface)is used to set/change the size of  of browser.
         
       // Thread.sleep(3000);
         
         //5.2
         //set position of window/browser.
         ////a.1st we hv to create obj of Point class for using d properties(x,y) of Point  class by an obj
         //import Point class to provide diff coordinates whenever the position of browser get changes.
         //new Point is para constructor passing the arg(x,y)of window
         
        /* Point p=new Point(800,700);//(x,y)
         //driver.manage().window().setPosition(p);*/
         
          // Thread.sleep(3000);
         
         //6
        // driver.close();
         //close is method of WebDriver(I) returns void.
         //used to closed the current (single)window/tab of browser opened by the selenium(bcz webbased)
         
        
         //7
        // driver.quit();
         //quit is method of WebDriver(I) returns void.
         //used to closed the entire browser/driver.
         //used to closed all(multiple) tab associated with that browser/driver opened by seleniun(bcz webbased)
         
         //Thread.sleep(6000);
         
         //8
        // driver.navigate().to("https://www.facebook.com/login/");
         //it is method of Webdriver(I) used to navigate the url without loading the page
         //to method in which we hv to pass arg as a url returns Navigation(I)
         //to is overloaded method 1.string2.URL
         
         //9
        //driver.navigate().forward();
         //forward is method of WebDriver(I) returns void.
         //used to take forward by 1 page on the browser.
         
         //10
         //driver.navigate().back();
         //back is method of WebDriver(I) returns void.
         //used to take back by 1 page on the browser's history.
         
         //11
         //driver.navigate().refresh();
         //refresh is method of WebDriver(I) returns void.
         //used to refresh /reload the current page on the browser.
         
         //12
         driver.getCurrentUrl();
         //getCurrentUrl is method of WebDriver(I) returns String.
         //used to give the current url of the current webpage.
         //o/p must be stored in string var/obj.
          String url=driver.getCurrentUrl();
          System.out.println(url);
        
        //13
         //String title=driver.getTitle();
         //System.out.println(title);
         //getTitle is method of WebDriver(I) returns String.
        //used to give the current title of the current webpage in selenium
         //o/p must be stored in string var/obj.
       
        //14
          //***WebDriver***
          /* WebDriver is an interface present in selenium used to perform action on browser
        //***WebElement Interface***
        /*1.WebElement is interface in selenium which is used to perform different
         * actions on ele present on the webpage.
         * 2.to find the ele on the browser/webpage we need "findElement(BY class)" method
         * of webdriver interface.
         * 3.to perform the actions on webele we need to identify ele present 
         * on the webpageby using the locators.
         * 4.locators are used to identify /locate the ele present on browser/webpage.
         * locator-->id,classname,tagname,X-path,css-selector,linked text,partial linked text,name
         * 
         */
         
          
          /******locators***********/
          /*1.to find the ele on the browser/webpage we need "findElement(BY class)" method
         * of webdriver interface.
         * 2.findelement method will identify all located ele with th help of
         * "BY" class,that is findelement method will accept the BY class type arg.
         * 3.BY class contains  the Static method and all this method are known as locators
         * in the selenium.
         * 4.locators provide the way to access the HTML ele from the webpage
         * 5.*/
         
          
          //16.locators
          //1.id
         /* WebElement User_Id=driver.findElement(By.id("identifierId"));
          User_Id.sendKeys("prajaktasagane94@gmail.com");*/
          
     /*    WebElement userid=driver.findElement(By.id("email"));
          userid.sendKeys("k_dprajakta@yahoo.in");
          Thread.sleep(3000);
          //WebElement is an interafce (like datatype) usedid is like variable name
          //driver is ref of WebDriver findElement is the abstract method of 
          //webelement to which implementation given by "BY" (abstract class)
          //id is attribute of "BY" class in which we pass d arg /value("email")of webele present on webpage
          
          //2.name
          WebElement password=driver.findElement(By.name("pass"));
          password.sendKeys("7567858");*/
         /* the "By" class provides the "name" method, which accepts the value of the "name" attribute of the web element. 
           * So, using this, we can locate a web element that has a unique name attribute.
           sendKeys is the method of webelement which is used to entered value/input into textbox
           use only for textbox.it taks sequence of char.*/
           
          
          
          
        //  3.id
        /*  WebElement log_button=driver.findElement(By.id("loginbutton"));
          log_button.click();*/
          
          //4.id
         /* WebElement continue_button=driver.findElement(By.id("checkpointSubmitButton"));
          continue_button.click();*/
          
          //5.name
         /* WebElement radiobutton=driver.findElement(By.tagName("input"));
          radiobutton.click();*/
          
          //6.name
      /*    WebElement continue_button2=driver.findElement(By.tagName("button"));
          continue_button2 .click();*/ 
          
          
          // 7.className
          
        /*  WebElement forgot_pw = driver.findElement(By.className("_97w4"));
          forgot_pw.click();*/
          
          // 8.linkText
          
        WebElement signup=driver.findElement(By.linkText("Sign up for Facebook"));//text present on link
          signup.click();
          
          //9.partialLinkText//half text u cn take insted of full text present on any link/button
          
         /* WebElement clickmore = driver.findElement(By.partialLinkText("more"));
           clickmore.click();*/  
          
          //x-path//comb of mulitiple attributes
          // attributes are present on webelelments(each webelements hv an mulitiple attributes) it is comb of key=value(key,val..ex:-
           //type="submit"-->type is key ,submit is value.type="submit" is 1 attribute like this.
          
           // 1.X-path by attributes
           
           /*comb of attribute(multiple)   
            * syntax:- " //tagname[@attribute='attribute_value']  "*/
           
           //   " //button[@name='websubmit'] "
           Thread.sleep(3000);
          
          /* WebElement sign_up=driver.findElement(By.xpath("//button[@name='websubmit']"));//"//button[@name='websubmit']" put this val as arg in Xpath
           sign_up.click();*/
           
           //2. X-path by text()(textfunct)
           
          /* syntax:- " //tagname[text()='element_text']  "*/  //a[text()='Already have an account?']
                   /* WebElement hvaccount=driver.findElement(By.xpath("//a[text()='Already have an account?']"));
           hvaccount.click();*/
           
           
           
          /* WebElement firstname=driver.findElement(By.name("firstname"));// by name
           firstname.sendKeys("prajakta");*/

        /*   WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));// by xpath by attribute
            firstname.sendKeys("prajakta");*/
           
          /* WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname'or@label='First name']"));
           firstname.sendKeys("prajakta")*/;//xpath by keyword 'or'(with two attribute of same element]
        	
   /*       WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname'or@label='First name']"));
           firstname.sendKeys("prajakta");
           
         /*  WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']/preceding-sibling::div"));
           firstname.sendKeys("prajakta");*/
         
           
      //    WebElement surname=driver.findElement(By.name("lastname"));//by name
        //   surname.sendKeys("kalmegh");
            
          /*  WebElement surname=driver.findElement(By.xpath("//input[text()='Surname']"));//xpath by text()
            surname.sendKeys("kalmegh");*/
            
        /*   WebElement emailid=driver.findElement(By.name("reg_email__"));
           emailid.sendKeys("prajaktakalmegh@23gmail.com");
           
           WebElement pw=driver.findElement(By.id("password_step_input"));
           pw.sendKeys("98fsgd@");
           
           WebElement reemail_id=driver.findElement(By.name("reg_email_confirmation__"));
           reemail_id.sendKeys("prajaktakalmegh@23gmail.com");*/
           
           Thread.sleep(500);
           
         WebElement day=driver.findElement(By.xpath("//option[text()='4']//following-sibling::option[text()='5']"));//following sibling//2nd way-->//option[text()='21']-->xpath by text()
           day.click();////option[text()='21']
           
           Thread.sleep(3000);
           WebElement month=driver.findElement(By.xpath("//option[text()='Mar']//parent::select"));////option[text()='Feb']-->xpath by text()
           month.click();/*xpath by parent(child to its immidaiate parent)
           2.//taganame of child[attribute/text() of child]/parent::taganame of immidiate parent
            *///option[text()='21']////option[text()='Mar']/parent::select[@id='month']
            boolean month_mar=month.isSelected();//not working dropdown
            System.out.println(month_mar);//false -->not selected
            if(month_mar==false)
            {
            	month.click();
            }
            System.out.println(month_mar);
            
            String mon_txt=month.getText();//return txt present on webele
             System.out.println(mon_txt);
         /*  WebElement year=driver.findElement(By.xpath("//option[text()='1999']"));//xpath by text()
           year.click();*/
           
           Thread.sleep(1000);
           
           WebElement female=driver.findElement(By.xpath("//label[text()='Female']//parent::span"));//xpath by parent//by className-->className("_58mt")
          // female.click();
            
           
            boolean fe_radbtt=female.isSelected();
            System.out.println(fe_radbtt);
            
            if(fe_radbtt==false)
            {
            	female.click();
            }
            System.out.println(fe_radbtt);
            
           
           Thread.sleep(1000); 
           
          WebElement sign_up = driver.findElement(By.xpath("//button[@name='websubmit']"));//xpath by attribute
           sign_up.click();
           
           Thread.sleep(1000); 
           
         /*  WebElement privacy=driver.findElement(By.xpath("//a[@id='privacy-link']"));
           privacy.click();
           
           Thread.sleep(1000);*/
           
          /* WebElement cookies=driver.findElement(By.xpath("//a[text()='Cookies Policy']"));
           cookies.click();*/
           
          /* WebElement alreadyhvacc=driver.findElement(By.xpath("//a[@aria-label='Already have an account?']/parent::div)"));//by parent keyword
           alreadyhvacc.click();*///xpath by parent keyword
           // Thread.sleep(-3000);//throw illegalargumentexception
           
           
           
           
           
        
	}

}
