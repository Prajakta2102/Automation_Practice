package browser_Launching;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Orange_HRM 
{
	 
	public static void ExplicitWait(WebDriverWait wait,WebElement refname,WebDriver driver)
	{
	 wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(refname));
		
	}

	public static void main(String[] args)throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        
        WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
      
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
       
        if((Username.isDisplayed())&&(Password.isDisplayed()))
        {
        	System.out.println("available");
        	
        	Username.sendKeys("Admin");
        	Password.sendKeys("admin123");
        }
        else
        {
        	System.out.println("not available");
        }

     /*   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));*/
     
        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        
        boolean logbtn=loginbtn.isEnabled();
        System.out.println(logbtn);
        if(logbtn==true)
        {
        	loginbtn.click();//
        }
        
       /* WebElement Forgotpw = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p"));
        if(Forgotpw.isDisplayed())
        {
        	System.out.println(Forgotpw.isDisplayed());
        	Forgotpw.click();
        	
        }
        */
        //Home page-->Admin-->User Management
        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']"))); 
        WebElement Admin = driver.findElement(By.xpath("//span[text()='Admin']"));
        boolean admin_btn=Admin.isEnabled();
        System.out.println(admin_btn);
        if(Admin.isEnabled())
        {

        	System.out.println(Admin.isSelected());
        	Admin.click();
        	
        }
      
        WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='User Management ']"))); 
       
        WebElement User_Managementdropdown= driver.findElement(By.xpath("//span[text()='User Management ']"));
        boolean User_Managementdropdown1= User_Managementdropdown.isEnabled();
        System.out.println(User_Managementdropdown1);
        User_Managementdropdown.click();
      
       

        WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Users']")));
        WebElement Users= driver.findElement(By.xpath("//a[text()='Users']"));
        boolean Users1=Users.isDisplayed();
        System.out.println(Users1);
        Users.click();//
       
        WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait5 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='oxd-icon-button']")));
        WebElement Systemuser= driver.findElement(By.xpath("//button[@class='oxd-icon-button']"));
       // Systemuser.click();
        
       WebElement userrole= driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//div[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(userrole).click().build().perform();//
       /* //userrole.sendKeys("Admin");
        WebElement admin= driver.findElement(By.xpath("//div[text()='ESS']"));
        act.moveToElement(admin).perform();
        act.moveToElement(admin).click().build().perform();*/
        
        WebElement PIM = driver.findElement(By.xpath("//span[text()='PIM']"));
        System.out.println(PIM.getText());//
        PIM.click();
        

        WebDriverWait wait6=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Configuration ']")));
        
        
        WebElement configuration= driver.findElement(By.xpath("//span[text()='Configuration ']"));
        System.out.println(configuration.getText());
        configuration.click();
       
        //configuration.sendKeys(Keys.ARROW_DOWN);
        
        
        WebElement dropdown2= driver.findElement(By.xpath("//a[text()='Custom Fields']"));
        System.out.println(dropdown2.getText());
        Actions act1 =new Actions(driver);
        act1.moveToElement(dropdown2).perform();
        act1.moveToElement(dropdown2).click().build().perform();
        

        WebDriverWait wait7=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add Employee']")));
        WebElement Add_emp= driver.findElement(By.xpath("//a[text()='Add Employee']"));
        System.out.println( Add_emp.getText());
        Add_emp.click();//
        
       
        WebDriverWait wait8=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
        WebElement fname= driver.findElement(By.xpath("//input[@name='firstName']"));
        System.out.println(fname.getAttribute("name"));
        fname.sendKeys("Prajakta");
        
        WebDriverWait wait9=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='middleName']")));
        WebElement mname= driver.findElement(By.xpath("//input[@name='middleName']"));
        System.out.println(mname.getAttribute("name"));
        mname.sendKeys("Abhishek");
        
        
        WebDriverWait wait10=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']")));
        WebElement lname= driver.findElement(By.xpath("//input[@name='lastName']"));
        System.out.println(lname.getAttribute("name"));
        lname.sendKeys("Sagane");//
        
        WebElement savebtn= driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println(lname.getText());
        savebtn.click();//
        
        
        WebElement leave= driver.findElement(By.xpath("//span[text()='Leave']"));
        System.out.println(lname.getText());
        leave.click();
        
        
        WebDriverWait wait11=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Configure ']")));
        WebElement configurelist= driver.findElement(By.xpath("//span[text()='Configure ']"));
        System.out.println(configurelist.getText());
        configurelist.click();
        
        WebElement holidays= driver.findElement(By.xpath("//a[text()='Holidays']"));
        System.out.println(holidays.getText());
        Actions act2=new Actions(driver);
        act2.moveToElement(holidays).perform();
        act2.moveToElement(holidays).click().perform();//
        
        WebDriverWait wait12=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Christmas Day']")));
        WebElement christmusholiday= driver.findElement(By.xpath("//div[text()='Christmas Day']"));
        System.out.println(christmusholiday.getText());
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",christmusholiday);
        
       System.out.println( christmusholiday.isSelected());
       WebElement time= driver.findElement(By.xpath("//span[text()='Time']"));
       System.out.println(time.getText());
        time.click();
        
        WebDriverWait wait13=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Timesheets ']")));
        WebElement Timesheet= driver.findElement(By.xpath("//span[text()='Timesheets ']"));
        System.out.println(Timesheet.getText());
        Timesheet.click();
        
        Actions act3=new Actions(driver);
        WebElement MyTimesheet= driver.findElement(By.xpath("//a[text()='My Timesheets']"));
        act3.moveToElement(MyTimesheet).perform();
        act3.moveToElement(MyTimesheet).click().build().perform();
        

       /* WebDriverWait wait14=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///button[text()=' Submit ']")));
        WebElement submitbtn2= driver.findElement(By.xpath("//button[text()=' Submit ']"));
        System.out.println(submitbtn2.getText());
        submitbtn2.click();*/
        
	}

}
