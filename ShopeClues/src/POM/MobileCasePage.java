package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;

public class MobileCasePage extends BasePage {
	@FindBy(xpath="//div[@class='col-lg-12 text-center Margin20']/a/img")
	private WebElement printAndAcc;
	@FindBy(id="det_img_125846489")
	private WebElement printlandBlackCov;
	public MobileCasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clkIvoomiMob()
	{
		printAndAcc.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(2));
		
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(printAndAcc));
	}
	public void clkPrintlandBlkCov()
	{
		verifyElement(driver, ETO, printAndAcc);
		printAndAcc.click();
	}

}
