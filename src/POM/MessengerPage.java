package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class MessengerPage extends BasePage
{
	@FindBy(xpath="//input[@class='_58al']")
	private WebElement searchtxtbox;
	
	@FindBy(xpath="//a[@title='Send a Like']")
	private WebElement likebtn;
	
  @FindBy(xpath="(//span[.='Delete'])[1]")
  private WebElement deletebtn;
 
  @FindBy(xpath="(//div[@class='_1qt4 _5l-m'])[1]")
  private WebElement convesationbtn;
  
  @FindBy(xpath="(//div[@class='_5blh _4-0h'])[22]")
  private WebElement settingsbtn;
  
  @FindBy(xpath="//button[.='Delete']")
  private WebElement dltbtn1;
  
  @FindBy(xpath="//div[@class='_1mf _1mj']")
  private WebElement msgtextbox;
  
  public MessengerPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void search(String name)
  {
	  searchtxtbox.sendKeys(name);
  }
  
  public void conversation()
  {
	  convesationbtn.click();
  }
  
    public void settings()
    {
    	settingsbtn.click();
    }
    
    public void delete()
    {
    	deletebtn.click();
    }
     
    public void deleteagain()
    {
    	dltbtn1.click();
    }
    public void typemessage(String msg)
    {
    	msgtextbox.sendKeys(msg);
    }
    public void like()
    {
    	likebtn.click();
    }
  
  
  
}
