  package browser_Launching;
import java.util.List;
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable_FetchData 
{

	//****fetching data for particular company details**************//
	
	public static void fetch_CompanyDetails(WebDriver driver,String company_Name)
	{
		   List<WebElement>Company_Details= driver.findElements(By.xpath("//td[text()= '"+company_Name+"']/parent::tr//td"));
	       for(int i=0;i<Company_Details.size();i++)
	       {
	    	   WebElement a=Company_Details.get(i);
	    	   System.out.println(a.getText());
	       }
	  }
	
	//*************fetching data for only COMPANY column(total no.of company)*******//
    public static void fetch_CompanyColumn(WebDriver driver,String AlCompany_Nm)
	{
		List<WebElement>CompanyColumn=driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		int no_ofWebEle=CompanyColumn.size();
		System.out.println("Total no of comapny present in company col "+no_ofWebEle);
		int j=1;
		for(int i=0;i<no_ofWebEle;i++)
		{
			WebElement x=CompanyColumn.get(i);
			System.out.println(j++ +"]" +x.getText());
		}
	
	}
	//*************fetching data for only COUNTRY column(total no.of company)*******//
	public static void fetch_ContactColumn(WebDriver driver,String Al_Contact)
	{
		List<WebElement>ContactColumn=driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		int no_ofWebEle=ContactColumn.size();
        System.out.println("Total no of Contact present in Contact col "+no_ofWebEle);
		int j=1;
		for(int i=0;i<no_ofWebEle;i++)
		{
			WebElement x=ContactColumn.get(i);
			System.out.println(j++ +"]" +x.getText());
		}
		
	}
	
	//*************fetching data for only CONTACT column(total no.of company)*******//
	public static void fetch_CountryColumn(WebDriver driver,String Al_Country)
	{
		List<WebElement>ContactColumn=driver.findElements(By.xpath("//table[@id='customers']//td[3]"));
		int no_ofWebEle=ContactColumn.size();
        System.out.println("Total no of Country present in Country col "+no_ofWebEle);
		int j=1;
		for(int i=0;i<no_ofWebEle;i++)
		{
			WebElement x=ContactColumn.get(i);
			System.out.println(j++ +"]" +x.getText());
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        Thread.sleep(3000);
        fetch_CompanyDetails(driver,"Ernst Handel");//fetching particular company data
        System.out.println("_______________________________________________________________");
        fetch_CompanyColumn(driver,"Company");//fetching only company col
        System.out.println("_______________________________________________________________");
        fetch_ContactColumn(driver,"Contact");//fetching only Contact col
        System.out.println("_______________________________________________________________");
        fetch_CountryColumn(driver,"Country");//fetching only Country col
	}
}
 //xpath       
//table[@id='customers']//td[1]-->column xpath(changing td[index] only for fetching particular column data
//td[text()= '"+company_Name+"']/parent::tr//td -->//particular companyname/contact/country(just change accordingly)
 //td[text()= '"+company_Name+"']/parent::tr//td[text()='"+Contact+"']/parent::tr//td[text()='"+Country+"']   
//th[text()='Company']/parent::tr//th-->experiment      
        
        
        
        
        
        
        /*   List<WebElement>Company_Details= driver.findElements(By.xpath("//td[text()= '"+company_Name+"']/parent::tr//td"));
        int no_ofWebEle=Company_Details.size();
        
      System.out.println(no_ofWebEle);
        for(int i=0;i<no_ofWebEle;i++)
        {
        WebElement a=Company_Details.get(i);
        	System.out.println(a.getText());
        }
	*/
	
	

