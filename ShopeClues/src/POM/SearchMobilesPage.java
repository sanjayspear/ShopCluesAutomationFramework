package POM;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generics.BasePage;




public class SearchMobilesPage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobileLink;
	
	@FindBy(xpath="//a[.='All Mobile Phones']")
	private WebElement allMobilesLink;
	
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private WebElement searchBoxTB;
	
	@FindBy(id="det_img_127593408")
	private WebElement note4Link;
	
	@FindBy(xpath="(//h3[.='Xiaomi Redmi Note 4 - 4GB 64GB (6 Months Seller Warrant']/../div[2]/div[1]/span)[1]")
	private WebElement note4Price;
	
	public SearchMobilesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

	public void mouseOverMobileLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mobileLink).perform();
	}
	
	public void clickAllMobilesLink()
	{
		allMobilesLink.click();
	}
	
	public void enterTextToSearch()
	{
			ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			searchBoxTB.sendKeys("Xiaomi Redmi");
			searchBoxTB.sendKeys(Keys.ENTER);
	}
	
	public void checkPresenceofNote4()
	{
			ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			String price = note4Price.getText();
			if(note4Link.isDisplayed())
			{
				Reporter.log("Redmi Note 4 is Present",true);
				Reporter.log("Price: "+price,true);
			}
			else
			{
				Reporter.log("Redmi Note 4 is not Present",true);
				Assert.fail();
			}
	}

}
