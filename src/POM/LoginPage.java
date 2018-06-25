package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class LoginPage extends BasePage
{
 @FindBy(id="email")
 private WebElement emailtb;
 
 @FindBy(id="pass")
 private WebElement passtb;
 
 @FindBy(xpath="//input[@value='Log In']")
 private WebElement loginbtn;


   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void emailid(String id)
   {
	   emailtb.sendKeys(id);
   }
   
   public void password(String pwd)
   {
	   passtb.sendKeys(pwd);
   }
   
   public void login()
   {
	   loginbtn.click(); 
   }
}