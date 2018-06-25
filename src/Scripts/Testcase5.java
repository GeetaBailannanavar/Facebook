package Scripts;

import org.testng.annotations.Test;

import POM.FriendRequestPage;
import POM.HomePage;
import POM.LoginPage;
import genericlib.Base_test;
import genericlib.Excel;

public class Testcase5 extends Base_test
{
	 @Test
	public void action6() throws InterruptedException 
	{
		
		LoginPage l=new LoginPage(driver);
		 l.emailid(Excel.ExcelSheet(path, "sheet1", 1, 1));
		 l.password(Excel.ExcelSheet(path, "sheet1", 2, 1));
		 l.login();
		 
		 HomePage h=new HomePage(driver);
	     Thread.sleep(3000);
		 h.home();
		 Thread.sleep(5000);
			
		h.friendrequest();
		Thread.sleep(3000);
		
       h.messenger();
       Thread.sleep(4000);
	
		 h.ddown();
		 Thread.sleep(4000);
		 h.logout();
	}

}
