package POM;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;




public class CheckDiscountsPage extends BasePage{
private WebDriver driver;
	
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
		
	@FindBy(xpath="//a[.='Jeans']")
	private WebElement jeansLink;
		
	@FindBy(xpath="//img[@id='det_img_3949642']")
	private WebElement selectJeans;
	
	@FindBy(xpath="//span[@id='promo_txt']")
	private WebElement offersLink;
	
	@FindBy(xpath="//span[@class='f_price']")
	private WebElement finalPrice;
	
	@FindBy(xpath="//span[@class='o_price']")
	private WebElement disc1Price;
	
	@FindBy(xpath="//span[@class='o_price1']")
	private WebElement origPrice;
	
	@FindBy(xpath="//span[@class='discount']")
	private WebElement discountpcnt;
	
	public CheckDiscountsPage(WebDriver driver)
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
		jeansLink.click();
	}
	
	public void selectJeans()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		  
		int x = selectJeans.getLocation().getX();
		int y = selectJeans.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
			
		Actions action=new Actions(driver);
		action.moveToElement(selectJeans);
		selectJeans.click();
	}
	
	public void getOffersText()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		
		String finalText=finalPrice.getText();
		Reporter.log("Final Price: "+finalText,true);
		
		String disc1Text=disc1Price.getText();
		Reporter.log("1st Discounted Price: "+disc1Text,true);
		
		String originalPrice=origPrice.getText();
		Reporter.log("Original Price: "+originalPrice,true);
		
		String discount=discountpcnt.getText();
		Reporter.log("Percent Discount: "+discount,true);
	}


}
