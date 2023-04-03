package browser_Launching;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_OpnAlBtnWebpage 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");
      // driver.get("https://www.w3schools.com/html/html_tables.asp"); 
        //Thread.sleep(3000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement>Al_Button=driver.findElements(By.xpath("//a[contains(@class,'w3-btn')]"));                        //dynamic xpath relative xpath 
        int total_btn=Al_Button.size();
        System.out.println(total_btn);
        
        for(int i=0;i<total_btn;i++)
        {
        	WebElement textOn_alBtn=Al_Button.get(i);
        	 System.out.println(textOn_alBtn.getText());
        }

	}

}
//a[contains(@class,'w3-bar-item w3-button')]
//"//a[contains(@class,'w3-btn')]"
//a[contains(@class,'w3-btn')]
//a[contains(@class,'w3-right')]
//a[contains(@class,'w3-bar-item w3-button')]
////a[contains(@class,'w3-btn')]