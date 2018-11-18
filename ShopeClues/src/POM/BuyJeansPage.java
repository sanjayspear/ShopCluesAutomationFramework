package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;




public class BuyJeansPage extends BasePage{

private WebDriver driver;
		
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
		
	@FindBy(xpath="//a[.='Jeans']")
	private WebElement jeansLink;
		
	@FindBy(xpath="//img[@id='det_img_3949642']")
	private WebElement selectJeans;
		
	@FindBy(xpath="//a[.='Size Chart']/../span[3]")
	private WebElement selectSize;
		
	@FindBy(id="add_cart")
	private WebElement addCartLink;
		
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buyNow;
		
	@FindBy(id="zip")
	private WebElement zipcode;

	@FindBy(xpath="//input[@name='button']")
	private WebElement checkButton;
		
	@FindBy(xpath="(//span[.='560067'])[2]")
	private WebElement zipCheck;
		
//	@FindBy(xpath="(//p[@class='form']")
//	private WebElement msgCheck;
		
	@FindBy(id="main_user_login")
	private WebElement userNameTB;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTB;
	
	@FindBy(xpath="//a[.='Login via Password']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//a[.='Skip']")
	private WebElement skipLink;
		
	public BuyJeansPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}

	public void mouseOverJeans()
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(mensLink).perform();
		}
		
	public void clickOnJeans()
		{
			driver.switchTo().activeElement();
			jeansLink.click();
		}
		
	public void selectJeans()
		{
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			  
			int x = driver.findElement(By.xpath("//img[@id='det_img_3949642']")).getLocation().getX();
			int y = driver.findElement(By.xpath("//img[@id='det_img_3949642']")).getLocation().getY();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
				
			Actions action=new Actions(driver);
			action.moveToElement(selectJeans);
			selectJeans.click();
		}
	
	public void selectSize()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(2));
		selectSize.click();
	}
		
//	public void enterZipCode()
//		{
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(2));
//			zipcode.sendKeys("560067");
//		}
		
//	public void clickCheck()
//		{
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		    driver.switchTo().window(tabs2.get(2));
//			checkButton.click();
//		}
		
//	public void zipCodeCheck()
//		{
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		    driver.switchTo().window(tabs2.get(2));
//			zipCheck.getText();
//			if(zipCheck.getText()=="560067"&&msgCheck.getText()=="Item is available at ")
//			{
//				Reporter.log("Zip Code is Same",true);
//				Reporter.log("Test Passed",true);
//			}
			
//		}
//		
//	public void addToCart()
//		{
//			addCartLink.click();
//		}
		
	public void clickBuyNow()
		{
			buyNow.click();
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
		loginBTN.click();
	}
	
	public void clickSkip()
	{
		skipLink.click();
	}
	
}

