package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//step 1
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
			WebElement accountandlist;
	@FindBy(xpath="//a[@class='nav-action-signin-button'] ")
	WebElement signin;
	@FindBy(name="email")
	WebElement email;
	//@FindBy(id="twotabsearchtextbox")
	//WebElement searching;
	//step2
	public void acandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signinmethod()
	{
		signin.click();
	}
	/*public void searchingmethod()
	{
		searching.sendKeys("toys");
	}*/
	
	//step3
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
