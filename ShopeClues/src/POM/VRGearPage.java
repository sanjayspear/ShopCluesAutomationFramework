package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;



public class VRGearPage extends BasePage {
@FindBy(xpath="//input[@id='autocomplete']")
private WebElement searchBox;
@FindBy(xpath="//a[.='Search']")
private WebElement searchButton;
@FindBy(xpath="//img[@id='det_img_107464763']/../..")
private WebElement iBSGlass3D;
@FindBy(xpath="//img[@id='det_img_107464431']/../..")
private WebElement iBSGlassVrBox;
	public VRGearPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}
	public void enterSearchBox()
	{
		searchBox.sendKeys("VR-BOX Virtual Real");
	}
	public void clkSearchBtn()
	{
		searchButton.click();
	}
	public void clkIBSGlass3D()
	{
		verifyElement(driver, ETO, iBSGlass3D);
		iBSGlass3D.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(2));
	}
	public void clkIBSGlassVRBox()
	{
		verifyElement(driver, ETO, iBSGlassVrBox);
		iBSGlassVrBox.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(2));
	}
	

}
