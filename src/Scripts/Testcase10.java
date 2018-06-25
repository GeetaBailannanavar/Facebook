package Scripts;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import genericlib.Base_test;

public class Testcase10 extends Base_test
 {
   @Test
   public void test2() throws InterruptedException
   {
	   LoginPage l=new LoginPage(driver);
		 l.emailid("geetabailannanavar@gmail.com");
		 l.password("GeetaB@1995");
		 l.login();
		 
		 HomePage h=new HomePage(driver);
	    Thread.sleep(3000);
		// h.home();
		 Thread.sleep(4000);
		 h.events();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(6000);
		 h.jobs();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(8000);
		 h.ddown();
		 Thread.sleep(8000);
		 h.logout();
	
   }
}
