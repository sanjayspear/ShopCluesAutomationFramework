package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;




public class SearchBoxPage extends BasePage {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private WebElement searchBoxTB;
	
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchBTN;
	
	@FindBy(xpath="//a[.='Low Price']")
	private WebElement priceFilter;
	
	public SearchBoxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void enterTextInSearchBox()
	{
		searchBoxTB.sendKeys("Headphones");
	}
	
	public void clickSearchButton()
	{
		searchBTN.click();
	}
	
	public void selectPriceFilter()
	{
		priceFilter.click();
	}
}
