package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;

public class MemoryCardPage extends BasePage{
	@FindBy(xpath="//div[@class='column col3']")
	private WebElement samsunuEv;
	@FindBy(id="add_cart")
	private WebElement addCart;
	@FindBy(xpath="//span[@class='cart_icon_count']")
	private WebElement mouseHoverCart;
	@FindBy(xpath="//a[.='View Cart']")
	private WebElement viewCart;
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buy;
	public MemoryCardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkSamEv()
	
	{
		
		verifyElement(driver, ETO, samsunuEv);
		samsunuEv.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;
		driver.switchTo().window(whs.get(2));
	}
	public void clkAddCart()
	{
		verifyElement(driver, ETO, addCart);
		addCart.click();
	}
	public void mousehover(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(mouseHoverCart).perform();
		
	}
	public void clkViewCart()
	{
		verifyElement(driver, ETO, viewCart);
		viewCart.click();
	}
	
	public void clkBuy()
	{
		verifyElement(driver, ETO, buy);
		buy.click();
	}

	
	
}
