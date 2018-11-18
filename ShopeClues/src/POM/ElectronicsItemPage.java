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




	public class ElectronicsItemPage extends BasePage{
		private WebDriver driver;
		
		@FindBy(xpath="//a[.='Electronics']")
		private WebElement electronicsLink;
			
		@FindBy(xpath="//a[.='Pen Drives']")
		private WebElement pendriveLink;
		
		@FindBy(id="det_img_97734008")
		private WebElement pdLink;
		
		@FindBy(xpath="//span[.='(19)']")
		private WebElement reviewCountLink;
		
		public ElectronicsItemPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
			
		public void mouseOverElectronics()
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(electronicsLink).perform();
		}
		
		public void clickOnPenDrives()
		{
			driver.switchTo().activeElement();
			pendriveLink.click();
		}
		
		public void selectPenDrive()
		{
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			  
			int x = pdLink.getLocation().getX();
			int y = pdLink.getLocation().getY();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
				
			Actions action=new Actions(driver);
			action.moveToElement(pdLink);
			pdLink.click();
		}

		public void getReviewCount()
		{
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(2));
			
			String count = reviewCountLink.getText();
			Reporter.log("People Reviewed: "+count,true);
		}

}
