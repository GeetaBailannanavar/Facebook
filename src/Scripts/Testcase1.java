package Scripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import genericlib.Base_test;
import genericlib.Excel;

public class Testcase1 extends Base_test
{
   @Test
   public void action1() throws InterruptedException
   {
	 LoginPage l=new LoginPage(driver);
	 l.emailid(Excel.ExcelSheet(path, "sheet1", 1, 1));
	 l.password(Excel.ExcelSheet(path, "sheet1", 2, 1));
	 l.login();
	
//	 Alert a = driver.switchTo().alert();
//	 a.dismiss();

	 HomePage h=new HomePage(driver);
	 Thread.sleep(5000);
	 h.home();
	 Thread.sleep(2000);
	 h.notifications();
	 Thread.sleep(5000);
	 h.friendrequest();
	 Thread.sleep(4000);
	 h.ddown();
	 Thread.sleep(3000);
	 h.logout();
   }
}
