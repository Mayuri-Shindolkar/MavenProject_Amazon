package package1.Project1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 extends Launch_Quit
{
	@Test
	public void logintoamazon() throws InterruptedException 
	{
		
		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		Thread.sleep(1000);
		h1.signinmethod();
		Login l1=new Login(driver);
		l1.emailmethod();
		l1.continue_button();
		l1.pwd();
		l1.submit_button();
		//h1.searchingmethod();
		//Logout l2=new Logout(driver);
		//l2.acandlist(driver);
		//l2.signout_button();
	}

}
