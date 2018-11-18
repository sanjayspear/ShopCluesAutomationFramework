package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;





public class CallUsPage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Call Us']")
	private WebElement callUsLink;
	
	@FindBy(id="main_user_login")
	private WebElement userNameTB;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTB;
	
	@FindBy(id="login_button")
	private WebElement loginBtn;
	
	@FindBy(id="a_close_id")
	private WebElement skipLink;
	
	@FindBy(xpath="//a[.='Contact Us']")
	private WebElement contactUsLink;
	
	
	public CallUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickCallUsLink()
	{
		callUsLink.click();
	}
	
	public void setUserName()
	{
		userNameTB.sendKeys("parasaranajoy@gmail.com");
	}
	
	public void setPassword()
	{
		passwordTB.sendKeys("paras@90");
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void clickSkip()
	{
		
		skipLink.click();
	}
	
	public void clickContactUs()
	{
		
		contactUsLink.click();
	}

}
