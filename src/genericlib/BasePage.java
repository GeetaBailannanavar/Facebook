package genericlib;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	WebDriver driver;
 public void Elementpresent(WebElement element,WebDriver driver)
 {
	try{
	WebDriverWait w=new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.visibilityOf(element));
	}
	catch(Exception e)
	{
		Reporter.log("element not present",true);
		Assert.fail();
	}
 }
 
 public void verifytitle(String title,WebDriver driver,WebElement element)
 {
	 try
	 {
	 WebDriverWait w=new WebDriverWait(driver,10);
	 w.until(ExpectedConditions.titleContains(title));
	 }
	 catch(Exception e)
	 {
		 Reporter.log("did't get page",true);
			Assert.fail();
	 }
 }
 
}
