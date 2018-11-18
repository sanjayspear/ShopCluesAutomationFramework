package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generics.BasePage;

public class InovuI7Page extends BasePage {
	
	@FindBy(xpath="//button[@id='add_cart']")
	private WebElement addCart;
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buy;
	@FindBy(xpath="//span[@id='5411357']")
	private WebElement culBlue;
	@FindBy(xpath="//span[@id='5411359']")
	private WebElement culBlack;
	@FindBy(xpath="//span[@id='5466513']")
	private WebElement culGrey;
	@FindBy(xpath="//input[@id='zip']")
	private WebElement pinCode;
	@FindBy(xpath="//input[@id='check_shipping']")
	private WebElement check;
	@FindBy(xpath="//a[.='Visit Seller Store']")
	private WebElement vstSellerStr;
	@FindBy(xpath="//a[@id='scrolltoreview']")
	private WebElement review;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement Cart;
	@FindBy(xpath="//span[contains(.,'IBS  glass 3D real')]")
	private WebElement verifyCart;
	public InovuI7Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkAddCart()
	{
		verifyElement(driver, ETO, addCart);
		addCart.click();
		
		
	}
	public void clkBuy()
	{	
		verifyElement(driver, ETO, buy);
		buy.click();
	}
	public void clkculBlue()
	{
		verifyElement(driver, ETO, culBlue);
		culBlue.click();
	}
	public void clkculBlack()
	{
		verifyElement(driver, ETO, culBlack);
		culBlack.click();
	}
	public void clkculGrey()
	{
		verifyElement(driver, ETO, culGrey);
		culGrey.click();
	}
	public void enterPinCode(String zip)
	{
		verifyElement(driver, ETO, pinCode);
		pinCode.sendKeys(zip);
	}
	public void clkcheck()
	{
		verifyElement(driver, ETO, check);
		check.click();
	}
	public void clkVisitSellerStore()
	{
		verifyElement(driver, ETO, vstSellerStr);
		vstSellerStr.click();
	}
	public void clkReview()
	{
		verifyElement(driver, ETO, review);
		review.click();
	}
	public void verifyCart()
	{
		Actions a = new Actions(driver);
		a.moveToElement(Cart);
		verifyElement(driver, ETO, verifyCart);
		Reporter.log("Item is present in the cart", true);
	}
	
	
	

}
