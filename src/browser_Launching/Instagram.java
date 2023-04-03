package browser_Launching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Instagram 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.instagram.com/accounts/emailsignup/");
      
        driver.manage().window().maximize();
        
           // keywords in xpath
        //relative xpath
       Thread.sleep(3000);
        
       WebElement loginbtn=driver.findElement(By.xpath("//p[contains(text(),'an')]//a[text()='Log in']"));
       loginbtn.click();//
        
       Thread.sleep(3000);
       WebElement mo_notxtbox=driver.findElement(By.xpath("//input[contains(@name,'username')]//parent::label"));
       mo_notxtbox.sendKeys("9373457274");
        
       Thread.sleep(3000);
       WebElement pw_txtbox =driver.findElement(By.xpath("//span[text()='Password']//following-sibling::input "));//xpath 
     // pw_txtbox.sendKeys("pra123");//button[@type='submit']//div[contains(text(),'in')]
      
      WebElement login_btn=driver.findElement(By.xpath("//button[@type='submit']//div[contains(text(),'in')]"));
       boolean pw1=pw_txtbox.isEnabled();
       System.out.println(pw1);
     /*  String pw_arr[]=new String[6];
       String email[]=new String[75];
       //String p1="praju1";
      
      String p="";
       
       if( pw_txtbox.equals(p.length()))
      
       {
    	   
    	   login_btn .click();
    	   System.out.println("length of pw is 6 "+login_btn.isEnabled());
       }
       else
       {
             pw_txtbox.sendKeys("pra123");
    	   System.out.println("login bttn is disabled..pw length should be 6 digit");
       }
       */
       
       
       
        
      /* WebElement login_btn1=driver.findElement(By.xpath("//button[@type='submit']//div[contains(text(),'in')]"));
       login_btn1.click();*/ 
        
        
        
        
        
        
        
        
        
        //1.and
        /* take 2 diff attribute/text() of same webele by using "and" */
      /*  WebElement mo_no=driver.findElement(By.xpath("//input[@name='emailOrPhone'and @aria-label='Mobile Number or Email']"));
        mo_no.sendKeys("9373457274");*/
        
        
        //2.or
        /* take 2 diff attribute/text() of same webele by using "or" */
      /*  WebElement fullname=driver.findElement(By.xpath("//input[@name='fullName'or @aria-label='Full Name']"));
        fullname.sendKeys("Prajakta sagane");*/
        
        /* take 2 diff attribute and text() of same webele by using "or" */
      //  WebElement login_fb=driver.findElement(By.xpath("//span[@class='_9zlu _aah_' or text()='Log in with Facebook']"));
      //  login_fb.click();
        
        
        
     
	
	}

}
