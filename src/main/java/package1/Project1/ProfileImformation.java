package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileImformation {
	
	//step1
	@FindBy(xpath="//span[.='Your Account']")
	WebElement your_account;
	//@FindBy(xpath="//span[.='Your Account']")
	//WebElement ;
	
    //step2
	public void youraccount()
	{
		your_account.click();
	}
	
	//step3
	public ProfileImformation (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}