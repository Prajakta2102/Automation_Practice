package pom_Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
public class Homepage_HRM 
{

	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//span[text()='User Management ']")
	private WebElement UserMnagement;
	
	@FindBy(xpath="//a[text()='Users']")
	private WebElement Users;
    
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	private WebElement Usermanagement_Usernm;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-select-text-input'][1]")
	private WebElement User_Role;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']//div[text()='Admin']")
	private WebElement Admin_Role;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmployeeName;
	
	@FindBy(xpath="//button[.=' Search ']")
	private WebElement Searchbtn;
	
	@FindBy(xpath="//div[@class='orangehrm-header-container']//button[@type='button']")
	private WebElement Addbtn;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement AddUser_Empnm;
	
	@FindBy(xpath="//div[.='Username']//input[@class='oxd-input oxd-input--active']")
	private WebElement AddUser_usernm; 
	
	@FindBy(xpath="//div[.='Password']//input[@class='oxd-input oxd-input--active']")
	private WebElement AddUser_password;
	@FindBy(xpath="//div[.='Confirm Password']//input[@class='oxd-input oxd-input--active']")
	private WebElement AddUser_confirmpassword;
	
	@FindBy(xpath="//span[.='Job ']")
	private WebElement job;
	
	@FindBy(xpath="//a[.='Job Titles']")
	private WebElement jobTitles;
	
	@FindBy(xpath="//div[@class='orangehrm-header-container']//button[@type='button']")
	private WebElement jobTitles_addbtn;
	
	@FindBy(xpath="//div[@class='orangehrm-card-container']//input[@class='oxd-input oxd-input--active']")
	private WebElement jobTitles_addjobtitle;
	
	@FindBy(xpath="//div[@class='orangehrm-card-container']//textarea[@placeholder='Type description here']")
	private WebElement Job_Description;
	
	@FindBy(xpath="//textarea[@placeholder='Add note']")
	private WebElement Add_note;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Addjobtitle_savebtn;
	
	@FindBy(xpath="//a[.='Pay Grades']")
	private WebElement paygrades;
	
	@FindBy(xpath="//a[text()='Employment Status']")
	private WebElement employmentstatus;
	
	@FindBy(xpath="//span[text()='Organization ']")
	private WebElement Organization ;
	
	@FindBy(xpath="//a[text()='General Information']")
	private WebElement Generalinfo ;
	
	@FindBy(xpath="//div[@class='oxd-switch-wrapper']")
	private WebElement Editbtn ;
	
	@FindBy(xpath="//div[@class='oxd-layout-container']//input[@class='oxd-input oxd-input--active'][1]")
	private WebElement OrangeHrm ;
	
	@FindBy(xpath="//div[@role='listbox']")////div[@class='oxd-select-wrapper']
	private WebElement Country ;
	@FindBy(xpath="//div[text()='India']")
	private WebElement CountryIndia ;
	
	public Homepage_HRM(WebDriver driver)//contstructor
    {
    	PageFactory.initElements(driver,this);
    }
	
    public void click_Admin()//public nonstatic
	{
		Admin.click();
	}
    public void click_UserManagement()
   	{
    	UserMnagement.click();
   	}
    public void click_Users()
   	{
    	Users.click();
   	}
	
    public void Enter_Usermanagement_Usernm(String Nm)
   	{
    	Usermanagement_Usernm.sendKeys(Nm);
   	}
    
   /* public void select_User_Role(WebDriver driver)throws InterruptedException
   	{
   
    	User_Role.sendKeys("Admin");
    	User_Role.sendKeys(Keys.ENTER);
    	/*	Actions act=new Actions(driver);
    	act.moveToElement(User_Role).perform();
    	act.moveToElement(User_Role).click().build().perform();
    	Thread.sleep(1000);
    	
    	act.moveToElement(Admin_Role).perform();
    	Thread.sleep(500);
     	act.moveToElement(Admin_Role).click().build().perform();
     	}*/
    public void Enter_EmployeeName(String Nm)
   	{
    	EmployeeName.sendKeys(Nm);
   	}

    public void clickon_Searchbtn()
   	{
    	Searchbtn.click();
   	}
    public void clickon_Addbtn()
   	{
    	Addbtn.click();
   	}
    public void Enter_AddUser_Empnm(String Nm)
   	{
    	AddUser_Empnm.sendKeys(Nm);
   	}
    public void Enter_AddUser_usernm(String nm)
    {
    	AddUser_usernm.sendKeys(nm);
   	}
    public void Enter_AddUser_password(String nm)
    {
    	AddUser_password.sendKeys(nm);
   	}
    public void Enter_AddUser_confirmpassword(String nm)
    {
    	AddUser_confirmpassword.sendKeys(nm);
   	}
    public void clickON_Job()
    {
    	job.click();
   	}
    public void clickON_jobTitles()
    {
    	jobTitles.click();
   	}
    public void clickON_jobTitles_addbtn()
    {
    	jobTitles_addbtn.click();//jobTitles_addjobtitle
   	}
    public void Enter_jobTitles_addjobtitle(String nm)
    {
    	jobTitles_addjobtitle.sendKeys(nm);
   	}
    public void Enter_Job_Description(String nm)
    {
    	Job_Description.sendKeys(nm);
   	}
    public void Enter_Add_note(String nm)
    {
    	Add_note.sendKeys(nm);
   	}
    public void clickOn_savebtn()
    {
    	Addjobtitle_savebtn.click();
   	}
    public void clickOn_paygrades()
    {
    	paygrades.click();
   	}
    public void clickOn_employmentstatus()
    {
    	employmentstatus.click();
   	}
    public void clickOn_Organization()
    {
    	Organization.click();
   	}
    public void clickOn_Generalinfo()
    {
    	Generalinfo.click();
    }
    public void clickOn_Editbtn()
   
    {
    	Editbtn.click();
    }
    public void enter_OrangeHrmName(String nm)
    
    {
    OrangeHrm.sendKeys(nm);
     }
    public void Select_Country()
    
    {
	   Country.click();
    }
   public void Select_CountryName()
    
     {
	   CountryIndia.click();
     }
	 
     /*Actions a=new Actions(driver);
       a.moveToElement(Country).perform();
       a.moveToElement(Country).click().build().perform();
   
       Thread.sleep(500);*/
      // a.moveToElement(CountryIndia).perform();
    //a.moveToElement(CountryIndia).click().build().perform();
   // a.sendKeys(Keys.ENTER);
   // a.scrollToElement(CountryIndia);
   /* JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeAsyncScript("arguments[0].scrollIntoView(true);", Country);
    Actions a=new Actions(driver);
    Thread.sleep(500);
    a.moveToElement(Country).perform();
    a.moveToElement(Country).click().build().perform();
    
     js.executeAsyncScript("arguments[0].scrollIntoView(true);", CountryIndia);
    CountryIndia.click();
       //a.moveToElement(CountryIndia).click().build().perform();*/
       

     
   
}
