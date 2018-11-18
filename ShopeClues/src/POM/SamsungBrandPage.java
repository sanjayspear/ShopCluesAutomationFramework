package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class SamsungBrandPage extends BasePage{
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement searchBox;
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchButton;
	@FindBy(xpath="//img[@id='det_img_117979841']/../..")
	private WebElement samsungGalJ7;
	
	public SamsungBrandPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void enterSearchContext()
	{
		verifyElement(driver, ETO, searchBox);
		searchBox.sendKeys("Samsung Galaxy J7 Prim");
	}
	public void clkSearch()
	{
		verifyElement(driver, ETO, searchButton);
		searchButton.click();
	}
	public void clkSamsungGalJ7()
	{
		verifyElement(driver, ETO, samsungGalJ7);
		samsungGalJ7.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(2));
	}
	
}
