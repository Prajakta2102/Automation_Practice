package pom_Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;//@FinBy annotation 
import org.openqa.selenium.support.PageFactory;//PageFactory class -->intiElements methods
import org.testng.annotations.BeforeMethod;

public class LogIn_Page 

{
/* POM->page obj model
 * ->ech POM class will contain individual webpage
 * ->to run POM class we need another class wid main method.
 * ->all navigational steps to test an appl will be contain in Test_Class
 * ->var should be private(encapsulation)
 * ->method(should nonstatic) and constructor should be public(encapsulation)
 * initElements->static method(elelocatefactory,obj) of PageFactory class return void
 * initailize all ele every time at calling so that no giving  StaleEleRefException
 * this is refer to al var
 *  follow abstraction only providing functionality in test class not showing implementation
 *  PageFcatory is class present in selenium with initElements(Static overloaded methods)returntype void
 *  to inialize the elements  and it  also overcome StaleEleRefException 
 *    FindBy is a class in selenium n we use FindBy annotation .
 *    The advantage of the model is that it reduces code duplication and improves test maintenance,readable,reusable*/

@FindBy(xpath="//input[@name='username']")
private WebElement Username;//encapsulation(strictly)(private var)

@FindBy(xpath="//input[@name='password']")
private WebElement Password;//encapsulation

@FindBy(xpath="//button[@type='submit']")
private WebElement LoginButton;//encapsulation


//each POM will contain separate method for individual webele

public LogIn_Page(WebDriver driver)// intialize constr/para constructor with public
{
	
	PageFactory.initElements(driver,this);//to protect from StaleEleRefException(performing actions on exsting webele on another webpage) 
	
}

public void enter_Username(String uName)//utilize all data member with access specifier public.
{
	Username.sendKeys(uName);
}

public void enter_Password(String pwd)
{
	Password.sendKeys(pwd);
}
public void clickOn_LogInBtn()
{
	LoginButton.click();
}

//POM classes will not contain main method
}
/*Below are the differences between FindBy and findElement in Selenium WebDriver:

FindBy is an annotation while findElement and findElements are methods. Remember FindBy is provided by Selenium not by TestNG. I saw some people have commented such differences.
FindBy is used to support PageObject pattern through PageFactory while findElement is normal way of locating a web element.
If we do not initialise page objects using PageFactory, @FindBy will throw NullPointerException which is not the case with findElement() or findElements() methods.
FindBy will look for the element only when it is used while findElement will look for an element as soon as you call it.
FindBy supports lazy initialization while findElement() and findElements does not.
FindBy can be used to locate one or all using a locator but you need to use findElement to locate one element and findElements to locate all elements using a locator.
You need to explicitly keep track of browser driver instance in FindBy annotated page elements i.e. using PageFactory class to initialize page elements while you call findElement() or findElements() directly on browser driver instance.
FindBy helps to handle StaleElementException as it looks for element every time when it is called. If you use findElement() or findElements() method and store the web element, it will not be relocated again until you do it explicitly.
FindBy supports PageObject pattern which helps you in designing neat tests. So Using FindBy is more preferable than findElement() Methods.*/
