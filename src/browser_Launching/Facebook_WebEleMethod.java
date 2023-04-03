package browser_Launching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;//used for dropdown
public class Facebook_WebEleMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup");//pass string as arg return void method of webdriver
       //wid loading page opn url
        driver.manage().window().maximize();
       // driver.get(https://www.facebook.com/signup)
        Thread.sleep(500);
       // driver.navigate().to("https://mail.google.com/mail/u/0/?tab=rm&ogbl#sent");
//        /*widout loading page opn or navigate to that url*/
        //methods of WebElement interface 
        /*1.sendKeys()-->void//(used to enter the input text 
        we pass seq of char/string as arg)*/
       
        WebElement firstname=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        firstname.sendKeys("prajakta");
 	   String fname_attr=firstname.getAttribute("aria-label");
 	   System.out.println(fname_attr);
 	   
        //firstname.sendKeys("prajakta");
        
        /*2.click()-->void//used to perform the click event on webele*/
        
        WebElement surname=driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@aria-label='Surname']"));
        surname.click();//relative Xpath //tagname[attribue of root of parent]//tagname of child[attribue of any child]
        
        
        WebElement surname1=driver.findElement(By.xpath("//div[text()='Surname']//following-sibling::input"));
        surname1.sendKeys("sagane");//
        /*/*x-path by following sibling :-1.to search 1st whether it is preceding /following sibling(multiple child of 1parent)
         *2.if it is following sibling--->syntax=>" //tagname of preceding sibling[atrribute/text()of preceding sibling]//following-sibling::[tagname of following sibling] 
         */
        
        
        ////input[@aria-label='Surname']
        Thread.sleep(500);
        
        /*3.isSelected()-->boolean(t/f)-->(it is already selected or not)*/
         //only on radio/checkbox/clickbox not working dropdown
        
        
    /*    WebElement female_radiobtn=driver.findElement(By.xpath("//input[@value='1']//preceding-sibling::label"));////label[text()='Female']
      //  female_radiobtn.click();
        /*x-path by preceding sibling :-1.to search 1st whether it is preceding /following sibling(multiple child of 1parent)
         *2.if it is preceding sibling--->syntax=>" //tagname of folowing sibling[atrribute/text()of following sibling]//preceding-sibling::[tagname of precedingsibling] 
         /3.you can take '/' also for preceding sibling (same procedure wid forwrd sibling)*/
      
        
        /* 1.create bool variable to perform oper on webele(radio/checkbox/clickbox) like isSelected.
         * 2.we cn add println stat to check whether val is t/f
         * 3.if val f then (radio btn it is not selected) 
         * 4.eneter into loop n perform oprn click on radio btn web ele(same procedures follow wid isDisplayed/isEnabled.
         */
      /*  boolean radio_btn= female_radiobtn.isSelected();//
       System.out.println(radio_btn);//false
       
       if(radio_btn==false)
       {
    	   female_radiobtn .click(); 
       }
       System.out.println(radio_btn);
        /*4.isDisplayed()-->boolean-->(webele is present or not)*/
         
     /*  WebElement female_radiobtn1=driver.findElement(By.xpath("//label[text()='Female']"));
       female_radiobtn1.click(); 
       
       boolean fe_radiobtn2 = female_radiobtn1.isDisplayed();//whether webele is display/present or not on webpage
       if(fe_radiobtn2==true)
       {
    	   System.out.println("available");
       }
       else
       {
    	   System.out.println("not available"); 
       }
       */
       WebElement mo_emailtxtbox=driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]//following-sibling::input"));//Xpath cotains tex()following_sbling
       mo_emailtxtbox.sendKeys("prajakafgh12@gmail.com");
       
      // boolean mo_mail=mo_emailtxtbox.isDisplayed();
       if(mo_emailtxtbox.isDisplayed())//(mo_mail==true)
       {

    	   System.out.println("available"); 
       }
       else
       {
	   System.out.println("not available");
       }
       /*1.staleEleReferanceexception--> if webele is not present on webpage 
        * like if we already detected d ele on that page n went to next page n try to perform opern on it
        * so it will give this exception(it is like stolen ele from other page n performing oper to dat ele on other  )..
        *2.invalidSyntaxException:--> if we miss any syntax error while finding webele] 
        *3.noSuchElementException:-->if we try find existing webele on other page which is not presnt  that page  */
       
	   /*  driver.navigate().to("https://www.facebook.com/login/");
	   //noSuchElementException--> // WebElement mo_emailtxtbox1=driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]//following-sibling::input"));//Xpath cotains tex()following_sbling
	    
	  // mo_emailtxtbox.isDisplayed();//staleEleexception
	   // surname1.isDisplayed();//staleEleexception*/
       
      /*5.isEnabled()-->boolean-->whether the webele is enabled/disabled          (ex:-button,txtbox etc)
       * return true if webele (button,textbox etc ) are in active state when we cn use/access /perform operation on it)
       */ ////div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_passwd__']
       WebElement pw_txtbox=driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_passwd__']"));//relative Xpath 
      // pw_txtbox.sendKeys("praj566"); 
       
       boolean pw=pw_txtbox.isEnabled();
       System.out.println(pw);//return true textbox is enabled to perform action
	   if(pw==true) 
	   {
		   pw_txtbox.sendKeys("arjun1234");   //perform action through sendKeys()
	   }
	   
	   /*6.getText()-->String(return)-->verify the text available(visible txt) on the webelement(btn/link)
	    */
	   
	   WebElement cust_redbtn=driver.findElement(By.xpath("//input[@name='sex']//preceding-sibling::label[text()='Custom']"));//preceding sibling keywords Xpath 
	   cust_redbtn.click();
	   
	   String rdbtntxt=cust_redbtn.getText();
	   System.out.println(rdbtntxt);//return txt present on webele
	   
	    
	  
	   
	   
	   
	   /*7.getAtribute()-->String(return)-->verify the  attribute value like placeholder present in html(returns the value of
	    *  the attribute passed as parameter).*/
	   
	  /* String fname_attr=firstname.getAttribute("placeholder");
	   System.out.println(fname_attr);*///not available return null val for attribute
	   
	   
	   /*how to handled DROPDOWN LiST??
	    * 1.click on the createnew.click()
	    * step 1.we have to create webele n apply findele(webdriver) on that webele
	    * 
	    * step 3. then we create obj of select class n class from org.openqa.selenium.support.ui.Select pck  
	    * step 4. calling  in parameterized constr call in obj pass arg/para of that ele()
	    * step 5.  with  obj we call methods of Select class
	    * 1.selectByIndex(0) -//pass index as arg datatype int-->void 
	    * 2. s.selectByValue("21");////pass arg as string datatype string   as arg-->void
	      3.s.selectByVisibleText("27");//pass string-->string as arg-->void
	     */
	   
	   WebElement day=driver.findElement(By.id("day"));
	  
	    
	    Select s=new Select(day);//ordinary select class in " org.openqa.selenium.support.ui.Select" in pckg 
	    s.selectByIndex(0);//pass index as arg datatype int-->void
	    Thread.sleep(500);
	    //s.selectByValue("21");////pass arg as string datatype string   as arg-->void
	   // s.selectByVisibleText("27");//pass (string)text-->string as arg-->void
	    
	   
	    WebElement month =driver.findElement(By.id("month"));
	   
	   Select sm=new Select(month);
	   sm.selectByValue("6");
	   Thread.sleep(500);
	   //sm.selectByValue("6");
	   
	 /*  boolean me=month.isEnabled();
	   System.out.println(me);
	   Thread.sleep(500);
	   if(me==true)
	   {
		  // month.click();
	   }
	   */
	   boolean ms=month.isSelected();
	   System.out.println(ms);
	   Thread.sleep(500);
	   if(ms==true)
	   {
		 month.isSelected() ; //int value,void
		
	   }
	   Thread.sleep(500);
	   boolean md=month.isDisplayed();
	   System.out.println(md);
	   if(md==true)
	   {
		   System.out.println("ele present on the webpage");
	   }
	   else
	   {
		   System.out.println("ele not present on the webpage");
	    }

	    WebElement year =driver.findElement(By.id("year"));
	   
	   Select sy=new Select(year);
	   sy.selectByVisibleText("2001");////select[@name='preferred_pronoun']
	   
	   WebElement selectpro=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	   
	   Select spro=new Select(selectpro);
	  // spro.selectByVisibleText("She: \"Wish her a happy birthday!\"");
	   //spro.selectByIndex(3);
	   spro.selectByValue("1");
	   
	   
	   WebElement email =driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));  
	   email.sendKeys("prajakafgh12@gmail.com");
	   WebElement sign2 =driver.findElement(By.xpath("//button[text()='Sign Up'and@name='websubmit']"));
	   sign2.click();
	   String signbtn=sign2.getText();
	   System.out.println(signbtn);
	   String expectedtxt="Sign Up";
	   if(expectedtxt.equals(signbtn))
	   {
		   System.out.println("pass");  
	   }
	   else
	   {
		   System.out.println("Fail");  
	   }
	   WebElement genderop =driver.findElement(By.xpath("//input[@name='custom_gender']"));
	   String genderval= genderop.getAttribute("aria-label");//placeholder
	   System.out.println(genderval);
	
	}
}

