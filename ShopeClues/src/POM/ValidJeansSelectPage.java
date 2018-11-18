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




public class ValidJeansSelectPage extends BasePage {
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
	
	@FindBy(xpath="//a[.='Jeans']")
	private WebElement jeansLink;
	
	@FindBy(xpath="//img[@id='det_img_3949642']")
	//@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/thumbnails/5812/320/320/STY1241405676929.jpg']")
	private WebElement selectJeans;
	
	@FindBy(xpath="//a[.='Size Chart']/../span[3]")
	private WebElement selectSize;
	
	@FindBy(id="add_cart")
	private WebElement addCartLink;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buyNow;
	
	@FindBy(id="zip")
	private WebElement zipcode;

	@FindBy(xpath="//input[@name='button']")
	private WebElement checkButton;
	
	@FindBy(xpath="(//span[.='560067'])[2]")
	private WebElement zipCheck;
	
	@FindBy(xpath="(//p[@class='form']")
	private WebElement msgCheck;
	
	
//	@FindBy(xpath="//input[@id=")
//	private WebElement userNameTB;
	
	
	public ValidJeansSelectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void mouseOverJeans()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mensLink).perform();
	}
	
	public void clickOnJeans()
	{
		driver.switchTo().activeElement();
		jeansLink.click();
	}
	
	public void selectJeans()
	{
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		  
		    //driver.findElement(By.xpath("//input[@placeholder='What are you looking for?']")).sendKeys("abc");;
		    //selectJeans.click();
		   // driver.close();
		    //driver.switchTo().window(tabs2.get(0));
//		String base = driver.getWindowHandle();
//		Set<String> set = driver.getWindowHandles();
//		 
//		set.remove(base);
//		assert set.size() == 1;
//		driver.switchTo().window((String) set.toArray()[0]);
//		selectJeans.click();
		
//		Set<String> allwh = driver.getWindowHandles();
//		for(String wh:allwh)
//		{
//			driver.switchTo().window(wh);
			int x = selectJeans.getLocation().getX();
			int y = selectJeans.getLocation().getY();
//
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			
			Actions action=new Actions(driver);
			action.moveToElement(selectJeans);
			  selectJeans.click();
//		}
//		selectJeans.click();
	}
	
	public void enterZipCode()
	{
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(2));
		zipcode.sendKeys("560067");
	}
	
	public void clickCheck()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(2));
		checkButton.click();
	}
	
	public void zipCodeCheck()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(2));
		zipCheck.getText();
		if(zipCheck.getText()=="560067"&&msgCheck.getText()=="Item is available at ")
		{
			Reporter.log("Zip Code is Same",true);
			Reporter.log("Test Passed",true);
		}
		
	}
	
	public void selectSize()
	{
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(2));
		selectSize.click();
	}
	public void addToCart()
	{
		addCartLink.click();
	}
	
	public void clickBuyNow()
	{
		buyNow.click();
	}
	
}

