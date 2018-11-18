package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics.BasePage;
import generics.CustomListner;
@Listeners(CustomListner.class)
public class PrintAndAcc extends BasePage {
	@FindBy(xpath="//h3[contains(.,'Classy Aam Aadmi ')]")
	private WebElement classyAmmAdmi;
	public PrintAndAcc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkClassyAmmAdmi()
	{
		classyAmmAdmi.click();
	}
	
	

}
