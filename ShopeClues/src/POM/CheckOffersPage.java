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


public class CheckOffersPage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
		
	@FindBy(xpath="//a[.='Jeans']")
	private WebElement jeansLink;
		
	@FindBy(xpath="//img[@id='det_img_3949642']")
	private WebElement selectJeans;
	
	@FindBy(xpath="//span[@id='promo_txt']")
	private WebElement offersLink;
	
	public CheckOffersPage(WebDriver driver)
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
		String offersText=offersLink.getText();
		Reporter.log("Offers: "+offersText,true);
	}

}
