package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;



public class ShareLoctionPage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Location']")
	private WebElement locationLink;
	
	@FindBy(xpath="//input[@placeholder='enter your pincode']")
	private WebElement pincodeTB;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitBTN;
	
	@FindBy(xpath="//span[.='560075']")
	private WebElement getLocationLink;
	
	public ShareLoctionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickLocationLink()
	{
		locationLink.click();
	}
	
	public void enterLocation(String pincode)
	{
		pincodeTB.sendKeys(pincode);
	}
	
	public void clickSubmit()
	{
		submitBTN.click();
	}
	
	public void matchLocation()
	{
		String loc = getLocationLink.getText();
		Reporter.log(loc,true);
		if(loc=="560075")
			Reporter.log("Entered PinCode is same as shown");
		else
			{
			Reporter.log("Entered PinCode is not same as shown");
			}
	}

}
