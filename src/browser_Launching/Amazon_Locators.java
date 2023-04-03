package browser_Launching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Amazon_Locators
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/your-account");
	    Thread.sleep(3000);
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin");
	  
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
	    
	    Dimension d=new Dimension(500,300);
	    driver.manage().window().setSize(d);
	    
	    Thread.sleep(1000);
	    
	    Point p=new Point(200,400);
	    driver.manage().window().setPosition(p);
	    
	    Thread.sleep(1000);
	    
	    driver.navigate().forward();
	    Thread.sleep(500);
	    
	    driver.navigate().refresh();
	    
	   String url= driver.getCurrentUrl();
	   System.out.println(url);
	   
	   String title=driver.getTitle();
	   System.out.println(title);
	    
	    driver.navigate().back();
	    Thread.sleep(500);
	    
	    driver.manage().window().maximize();
	    
	    
	    WebElement createnew= driver.findElement(By.linkText("Create your Amazon account"));//by linkText
	    createnew.click();	
	    
	    WebElement Yourname = driver.findElement(By.xpath("//input[contains(@id,'ap_customer_name')]"));//x-path by contains(attribute)
	    Yourname.sendKeys("Prajakta Sagane");
	    
	    WebElement dropdown_country=driver.findElement(By.xpath("//span[contains(@class,'a-button-text a-declarative')]"));//x-path by contains(attribute)
        dropdown_country.click();
        
        Thread.sleep(500);
	   
	    WebElement countrycode =driver.findElement(By.id("auth-country-picker_92"));//by id
	    countrycode.click();
	    
	    WebElement mo_no=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));//xpath by attribute
	    mo_no.sendKeys("9363146235");
	    
	    
	    WebElement pw = driver.findElement(By.xpath("//input[contains(@id,'ap_password')]"));//xpath by contains (attribute)
	   pw.sendKeys("87fhfsf");
	    
	  /*  WebElement email_id = driver.findElement(By.name("secondaryLoginClaim"));
	    email_id.sendKeys("kalmeghprajakta@gmail.com");*/
	   
	   
	   WebElement continue_bt= driver.findElement(By.xpath("//span[@id='auth-continue']"));//xpath by attribute
	   continue_bt.click();
	   
	   /*WebElement Solve_puzzle=driver.findElement(By.xpath("//button[contains(text(),'Solve')]"));//xpath by contains text()
	   Solve_puzzle.click();*///work only 1 time
	    
	   Thread.sleep(400);
	    
	/* WebElement Solve_puzzle=driver.findElement(By.xpath("//button[text()='Solve Puzzle'][1]"));//xpath by index(text())
	   Solve_puzzle.click(); //work only 1 time//nosuchelementexceptionfound error
	   
	  /* WebElement Solve_puzzle=driver.findElement(By.xpath("/html/body/div/div/div[1]/button"));// absolute xpath 
	   Solve_puzzle.click();*/// work only 1time
	   
	 /*  WebElement Solve_puzzle=driver.findElement(By.className("sc-nkuzb1-0 sc-d5trka-0 dsOMxw button"));// classname 
	   Solve_puzzle.click();*/ //invalidselsctorexception
	   
	 /*  WebElement Solve_puzzle=driver.findElement(By.linkText("Start Puzzle"));//
	   Solve_puzzle.click();*/
	   
	 /* WebElement metaaudio_button= driver.findElement(By.className("fc_meta_audio_btn"));//classname
	   metaaudio_button.click();*/
	   
	   
	    
	    

	}

}
