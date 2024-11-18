package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
		//step1
		WebDriver driver;
		WebElement email;
		@FindBy(id="continue")
		WebElement continue_button;
		@FindBy(name="password")
		WebElement password;
		@FindBy(id="signInSubmit")
		WebElement submit;	
		//step2
		public void emailmethod()
		{
			email.sendKeys("dtshindolkar55@gmail.com");
		}
		public void continue_button()
		{
			continue_button.click();
		}
		public void pwd()
		{
			password.sendKeys("deepak@9900");
		}
		public void submit_button()
		{
			submit.click();
		}
		//step3
		public Login(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	

}
