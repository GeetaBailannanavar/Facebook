package Scripts;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.MarketPage;
import genericlib.Base_test;
import genericlib.Excel;

public class Testcase8 extends Base_test
{
  @Test
  public void test9() throws InterruptedException
  {
	  LoginPage l=new LoginPage(driver);
		 l.emailid(Excel.ExcelSheet(path, "sheet1", 1, 1));
		 l.password(Excel.ExcelSheet(path, "sheet1", 2, 1));
		 l.login();
		 
		 HomePage h=new HomePage(driver);
	    Thread.sleep(3000);
		// h.home();
		 Thread.sleep(3000);
		 h.marketplace();
		 
		 MarketPage m=new MarketPage(driver);
		 Thread.sleep(8000);
		 m.buying();
		 Thread.sleep(6000);
		 m.groups();
		 Thread.sleep(6000);
		 h.ddown();
		 Thread.sleep(5000);
		 h.logout();
		 
  }
}
