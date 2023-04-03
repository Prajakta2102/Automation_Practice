package browser_Launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com/partners/login");
       
        driver.manage().window().maximize();
        
        
        WebElement register=driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 bJlTQY']//span[text()='Register']"));
        register.click();//relative xpath way 1.
        //*relative xpath parent class to any child class(//tagname[@attribute='value']//tagname[text()='value'])
	    //comb of x path by attribute of parent class+ comb of xpath by attribute/xpath by text() to immidiate child class
	    // 2.relative x path by attribute of parent class +(//tagname of child class) 
        // comb of 2 is enough
        

        WebElement create_acc=driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 geRggc']//span"));
        create_acc.click(); //relative xpath way 2.
        // relative x path by attribute of parent class +(//tagname of child class)
	
       
        register.click();
     
        /* master way to locate ele faster
         * syntax:->  //*[contains(text(),'text on ele')] 
         *  meaning of * --> any tag which have text only    */
       /* WebElement full_name =driver.findElement(By.xpath("//*[contains(text(),'Full Name')]"));
       full_name.sendKeys("prajakta sagane"); */
        
        
        
	
	
	}

}
