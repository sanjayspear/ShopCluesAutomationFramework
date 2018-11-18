package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;


public class IvoomiPage extends BasePage{
	@FindBy(xpath="//span//a[.='Ivoomi Me2']")
	private WebElement ivoomiMe2;
	@FindBy(xpath="//button[.='Add To Cart']")
	private WebElement addCart;
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buynow;
	@FindBy(xpath="//span[@id='5411359']")
	private WebElement colBlack;
	@FindBy(id="//span[@id='5419828']")
	private WebElement colGold;
	@FindBy(id="scrolltospecs")
	private WebElement moreSpec;
	@FindBy(xpath="//a[.='Visit Seller Store']")
	private WebElement visitsellerstr;
	@FindBy(xpath="//a[contains(.,'Reviews')]")
	private WebElement review;
	@FindBy(id="zip")
	private WebElement pinCode;
	@FindBy(id="check_shipping")
	private WebElement check;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement cart;
	@FindBy(xpath="//a[.='Specification']")
	private WebElement spec;
	@FindBy(xpath="//a[.='Product Description']")
	private WebElement prdDsp;
	@FindBy(xpath="//span//a[.='View All']")
	private WebElement viewAll;
	public IvoomiPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
//	public void clkIvoomeMe2() throws InterruptedException
//	{
//		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;
//
//		driver.switchTo().window(whs.get(1));
//		
//		WebDriverWait wait = new WebDriverWait(driver, ETO);
//		wait.until(ExpectedConditions.visibilityOf(ivoomiMe2));
//		ivoomiMe2.click();
//	}
	public void clkAddcrt()
	{ 
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(addCart));
		addCart.click();
	}
	public void clkBuy()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(buynow));
		buynow.click();
	}
	public void clkGold()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(colGold));
		colGold.click();
	}
	public void clkBlack()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(colBlack));
		colBlack.click();
	}
	public void clkMorespec()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(moreSpec));
		moreSpec.click();
	}
	public void clkVistseller()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(visitsellerstr));
		visitsellerstr.click();
	}
	public void clkReview()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(review));
		review.click();
	}
	public void enterZip(String zip)
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(pinCode));
		pinCode.sendKeys(zip);
	}
	public void scrollToElement()
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Point y = driver.findElement(By.xpath("//span//a[.='View All']")).getLocation();
		 j.executeScript("window.scrollTo(0,"+y+")");
	}

	
	

}
