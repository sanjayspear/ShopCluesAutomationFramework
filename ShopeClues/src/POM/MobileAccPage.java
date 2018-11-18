package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class MobileAccPage extends BasePage {
	@FindBy(xpath="//img[@id='det_img_123694208']/../..")
	private WebElement coverCaseIPhone5s;
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement searchBox;
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchButton;
	public MobileAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public void enterSearchContext()
	{
		verifyElement(driver, ETO, searchBox);
		searchBox.sendKeys("case and cover iphone 5s silver");
	}
	public void clkSearchBtm()
	{
		verifyElement(driver, ETO, searchButton);
		searchButton.click();
	}
	public void clkcoverCase()
	{
		verifyElement(driver, ETO, coverCaseIPhone5s);
		coverCaseIPhone5s.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;
		driver.switchTo().window(whs.get(2));
	}
	

}
