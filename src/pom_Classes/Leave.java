package pom_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Leave 
{
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leave;
	
	@FindBy(xpath="//a[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath="//a[text()='My Leave']")
	private WebElement myleave;
	
	public Leave(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void clickOn_leave()
	{
		leave.click();
	}

	public  void clickOn_apply()
	{
		apply.click();
	}
	
	public  void clickOn_myleave()
	{
		apply.click();
		String s=apply.getText();
		System.out.println(s);
	}
	

}
