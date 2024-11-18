package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
{
	WebDriver driver;
	//step2
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	@FindBy(xpath="//span[.='Sign Out']")
			WebElement signout;
	//step2
	public void acandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signout_button()
	{
		signout.click();
	}
	//step3
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
