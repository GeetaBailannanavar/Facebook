package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class FriendRequestPage extends BasePage
{
  @FindBy(xpath="(//button[@class='_42ft _4jy0 _4jy3 _517h _51sy'])[1]")
  private WebElement deteterqstbtn;



 public FriendRequestPage(WebDriver driver)
{
	  PageFactory.initElements(driver, this);
}

public void deleterqst()
{
	deteterqstbtn.click();
}
}