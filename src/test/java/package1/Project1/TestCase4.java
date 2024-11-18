package package1.Project1;

public class TestCase4 extends Launch_Quit
{
	public void profileinfo() throws InterruptedException {

		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		Thread.sleep(1000);
		h1.signinmethod();
		Login l1=new Login(driver);
		l1.emailmethod();
		l1.continue_button();
		l1.pwd();
		l1.submit_button();
	ProfileImformation p1=new ProfileImformation(driver);
	p1.youraccount();
}
}