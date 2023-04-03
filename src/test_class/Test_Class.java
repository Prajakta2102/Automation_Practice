package test_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

import pom_Classes.Homepage_HRM;
import pom_Classes.Leave;
import pom_Classes.LogIn_Page;

public class Test_Class 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriverService Stringoptions;
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		
	    
		options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        
        
  //1.
      
        LogIn_Page login=new LogIn_Page(driver);
        Thread.sleep(500);
        login.enter_Username("Admin");//+ve
        login.enter_Password("admin123");
       
        login.clickOn_LogInBtn();
        
        
        
  //2.   
        Homepage_HRM homepage=new Homepage_HRM(driver);
        Thread.sleep(500);
        homepage.click_Admin();
        Thread.sleep(1000);
        homepage.click_UserManagement();
        Thread.sleep(500);
        homepage.click_Users();
        Thread.sleep(1000);
        homepage.Enter_Usermanagement_Usernm("prajakta");
        Thread.sleep(500);
       // homepage.select_User_Role(driver);
       
        homepage.Enter_EmployeeName("Prajakta Abhishek Sagane");
        homepage.clickon_Searchbtn();
        Thread.sleep(500);
        homepage.clickon_Addbtn();
        Thread.sleep(500);
        homepage.Enter_AddUser_Empnm("Prajakta Sagane");
        homepage.Enter_AddUser_usernm("praju@");
        homepage.Enter_AddUser_password("Prajakta@123");
        homepage.Enter_AddUser_confirmpassword("Prajakta@123");
        
        homepage.clickON_Job();
        Thread.sleep(500);
        homepage.clickON_jobTitles();
        Thread.sleep(500);
        homepage.clickON_jobTitles_addbtn();
        Thread.sleep(500);
        homepage.Enter_jobTitles_addjobtitle("software tester");
        Thread.sleep(500);
        homepage.Enter_Job_Description("To Automated the Functionalities of Web-App by running testscript.to check application is working properly or not by using selelinum tool.");
	    Thread.sleep(500);
	    homepage.Enter_Add_note("i have 1 year experienced in automation testing ");
	    homepage.clickOn_savebtn();
	    Thread.sleep(500);
	    
	  
	    homepage.clickON_Job();
	    homepage.clickOn_paygrades();
	   Thread.sleep(500);
	    homepage.clickon_Addbtn();
	    Thread.sleep(500);
	    homepage.Enter_Usermanagement_Usernm("prajaktaAs");
	    Thread.sleep(500);
	    homepage.clickOn_savebtn();
	    
	   // Thread.sleep(500);
	    homepage.clickOn_Organization();
	    Thread.sleep(500);
	    homepage.clickOn_Generalinfo();
	    Thread.sleep(500);
	    homepage.clickOn_Editbtn();
	    Thread.sleep(500);
	    homepage.enter_OrangeHrmName("OrangeHRM");
	    //Thread.sleep(500);
	    homepage.Select_Country();
	    //Thread.sleep(500);
	    homepage.Select_CountryName();
        
	    //3
	   /* Thread.sleep(500);
	    Leave l=new Leave(driver);
	    Thread.sleep(500);
	   l.clickOn_leave();
	    Thread.sleep(500);
	   l.clickOn_apply();
	    Thread.sleep(500);
	    l.clickOn_myleave();*/
	    
	    
	}
	

}
/*//1->positive testscript u cn run -ve testscript by changing para*/