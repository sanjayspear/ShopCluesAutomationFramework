package POM;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;




public class WarrantyCheckPage extends BasePage{
private WebDriver driver;
	
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobileLink;
	
	@FindBy(xpath="//a[.='Samsung']")
	private WebElement samsungLink;
	
	@FindBy(id="det_img_119717319")
	private WebElement j5primeLink;
	
	@FindBy(xpath="//a[.='More Specification']")
	private WebElement specificationLink;
	
	@FindBy(xpath="//span[.='Product Details:']")
	private WebElement productDetailsLink;
	
	@FindBy(xpath="//a[.='Specification']")
	private WebElement specDetails;
	
	@FindBy(xpath="//span[contains(.,':   1 Year')]")
	private WebElement warrantyLink;
	
	public WarrantyCheckPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void mouseOverMobileLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mobileLink).perform();
	}
	
	public void clickOnSamsungLink()
	{
		samsungLink.click();
	}
	
	public void clickOnSamsungJ5Prime()
	{
		ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		int x=j5primeLink.getLocation().getX();
		int y=j5primeLink.getLocation().getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		j5primeLink.click(); 
	}
	
	public void clickOnSpecification()
	{
		ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		specificationLink.click(); 
	}
	
	public void scrollToProductDetails()
	{
		ArrayList<String> tabs =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		
		int x=productDetailsLink.getLocation().getX();
		int y=productDetailsLink.getLocation().getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	
	public void goToSpecs()
	{
		int x=specDetails.getLocation().getX();
		int y=specDetails.getLocation().getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		String text=warrantyLink.getText();
		Reporter.log("Warranty: "+text,true);
	
	}


}
