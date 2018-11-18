package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class SmartGadgetPage extends BasePage {
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement searchBox;
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchButton;
	@FindBy(xpath="//img[@id='det_img_95162971']/../..")
	private WebElement padometer;
	public SmartGadgetPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	public void enterSearchBox()
	{
		verifyElement(driver, ETO, searchBox);
		searchBox.sendKeys("Gadget Heros Digital II LCD Pedometer");
	}
	public void clkSearchBtn()
	{
		verifyElement(driver, ETO, searchButton);
		searchButton.click();
	}
	public void clkPadometer()
	{
		verifyElement(driver, ETO, padometer);
		padometer.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(2));
	}

}
