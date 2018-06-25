package Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.MessengerPage;
import genericlib.Base_test;
import genericlib.Excel;

public class Testcase4 extends Base_test
{
@Test
public void actoin5() throws InterruptedException, AWTException
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
	 Thread.sleep(6000);
	 mp.search(Excel.ExcelSheet(path, "sheet1", 4, 1));
	 Thread.sleep(5000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(4000);
	 
	 h.profile();
	 Thread.sleep(6000);
	 h.ddown();
	 Thread.sleep(5000);
	 h.logout();
     
}
}
