package Scripts;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.MessengerPage;
import genericlib.Base_test;
import genericlib.Excel;

public class Testcase3 extends Base_test
{
  @Test
  public void action4() throws InterruptedException
  {
	  LoginPage l=new LoginPage(driver);
		 l.emailid(Excel.ExcelSheet(path, "sheet1", 1, 1));
		 l.password(Excel.ExcelSheet(path, "sheet1", 2, 1));
		 l.login();
		 
		 HomePage h=new HomePage(driver);
		Thread.sleep(4000);
		 h.home();
		 Thread.sleep(5000);
		 h.messenger();
		 Thread.sleep(5000);
			
		 MessengerPage mp=new MessengerPage(driver);
		 Thread.sleep(5000);
		 mp.conversation();
		 Thread.sleep(5000);
		 mp.settings();
		 Thread.sleep(4000);
		 mp.delete();
		 Thread.sleep(2000);
		 h.home();
  }
}
