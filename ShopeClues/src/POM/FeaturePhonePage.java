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



public class FeaturePhonePage extends BasePage {
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobiles;
	@FindBy(id="det_img_127990680")
	private WebElement inovui7;
	@FindBy(xpath="//div[@class='column col3']")
	private WebElement featurePhone;
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement searchBar;
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchButton;
	
	public FeaturePhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkinovui7Mob()
	{
		verifyElement(driver, ETO, inovui7);
		inovui7.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(2));
		

	}
	
	
	public void enterContextInScrBar()
	{
		verifyElement(driver, ETO, searchBar);
		searchBar.sendKeys("inovuI7");
				

	}
	public void clkSearchBtn()
	{
		searchButton.click();
	}
	
	

}
