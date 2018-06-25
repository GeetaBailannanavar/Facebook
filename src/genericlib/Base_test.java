package genericlib;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Constant
{
	public WebDriver driver;
@BeforeMethod
public void open()
{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	driver=new FirefoxDriver();
	driver.get(Excel.ExcelSheet(path, "sheet1", 0, 1));
  
}

@AfterMethod
public void closeapp()
{
	driver.quit();
}
}
