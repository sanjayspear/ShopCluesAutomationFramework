package POM;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;




public class CheckNote4ReviewsPage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobileLink;
	
	@FindBy(xpath="//a[.='All Mobile Phones']")
	private WebElement allMobilesLink;
	
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private WebElement searchBoxTB;
	
	@FindBy(id="det_img_127593408")
	private WebElement note4Link;
	
	@FindBy(xpath="(//a[contains(.,'Reviews')])[1]")
	private WebElement reviewLink;
	
	@FindBy(xpath="//div[@class='star_rating_point']/span")
	private WebElement ratingLink;
	
	public CheckNote4ReviewsPage(WebDriver driver)
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
	
	public void clickOnNote4()
	{
			ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			note4Link.click();
	}
	
	public void clickOnReviews()
	{
		ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		reviewLink.click();
	}
	
	public void getStarRatings()
	{
		String rating = ratingLink.getText();
		Reporter.log("Star Rating: "+rating,true);
	}

	
	
}
