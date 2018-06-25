package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class HomePage extends BasePage
{
   @FindBy(name="q")
   private WebElement searchbox;
	
   @FindBy(className="_1vp5")
   private WebElement profilebtn;
	
  @FindBy(xpath="(//a[contains(@class,'_2s25')])[2]")
  private WebElement homebtn;
  
  @FindBy(xpath="(//div[@class='_2n_9'])[3]")
  private WebElement notificationbtn;
  
  @FindBy(xpath="(//div[@class='_2n_9'])[2]")
  private WebElement msgbtn;
  
  @FindBy(xpath="(//div[@class='_2n_9'])[1]")
  private WebElement frndrqstbtn; 
  
  @FindBy(xpath="//div[@id='userNavigationLabel']")
  private WebElement dropdwn;
  
  @FindBy(xpath="(//span[@class='_54nh'])[9]")
  private WebElement logoutbtn;
  
  @FindBy(xpath="//div[.='Messenger']")
  private WebElement messengerbtn;
  
  @FindBy(xpath="//div[.='Marketplace']")
  private WebElement marketplacebtn;
  
  @FindBy(xpath="//div[.='Friend Lists']")
  private WebElement frndlistbtn;
  
  @FindBy(xpath="//div[.='Groups']")
  private WebElement grpsbtn;
  
  @FindBy(xpath="//div[.='Jobs']")
  private WebElement jobsbtn;
  
  @FindBy(xpath="//div[.='Events']")
  private WebElement eventbtn;
  
  @FindBy(xpath="//div[.='Pages']")
  private WebElement pagesbtn;
 
  
  public HomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void home()
  {
	  homebtn.click();  
  }
  public void notifications()
  {
	  notificationbtn.click();  
  }
  public void friendrequest()
  {
	  frndrqstbtn.click();
  }
  
 public void ddown()
 {
     dropdwn.click();
 }
   
 public void logout()
 {
	 logoutbtn.click();
 }
   public void searchname(String name)
   {
	   searchbox.sendKeys(name); 
   }
   
   public void profile()
   {
	   profilebtn.click();
   }
   
   public void messenger()
   {
	   messengerbtn.click();
   }
   public void marketplace()
   {
	   marketplacebtn.click();
   }
   
   public void friendlist()
   {
	   frndlistbtn.click();
   }
   
   public void groups()
   {
	   grpsbtn.click();
   }
   
   public void jobs()
   {
	   jobsbtn.click();
   }
   
   public void events()
   {
	   eventbtn.click();
   }
   
   public void pages()
   {
	   jobsbtn.click();
   }
  
  
}





