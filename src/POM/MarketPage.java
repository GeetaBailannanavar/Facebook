package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPage
{
	@FindBy(xpath="(//a[@class='_k01 _1itu _2pi2'])[3]")
	private WebElement sellingbtn;
	
	@FindBy(xpath="(//a[@class='_k01 _1itu _2pi2'])[2]")
	private WebElement buyingbtn;
	
	@FindBy(xpath="(//a[@class='_k01 _1itu _2pi2'])[4]")
	private WebElement savedbtn;
	
	@FindBy(xpath="(//a[@class='_k01 _1itu _2pi2'])[1]")
	private WebElement groupsbtn;
	
	
	
	
	 public MarketPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	 
	 public void selling()
	 {
		 sellingbtn.click(); 
	 }
	 
	 public void groups()
	 {
		 groupsbtn.click();
	 }
	 
	 public void buying()
	 {
		 buyingbtn.click(); 
	 }
	 
	 public void saveditem()
	 {
		 savedbtn.click();
	 }


}
