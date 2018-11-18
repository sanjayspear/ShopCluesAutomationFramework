package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
  
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;




public class InvalidMensJeansSelectionPage extends BasePage {
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
	
	@FindBy(xpath="//a[.='Jeans']")
	private WebElement jeansLink;
	
	@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/banners/FootwearCLP/Black-Jeans.jpg']")
	private WebElement selectJeans;
	
	
	public InvalidMensJeansSelectionPage(WebDriver driver)
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
		//driver.switchTo().activeElement();
		int x = driver.findElement(By.id("det_img_3949642")).getLocation().getX();
		int y = driver.findElement(By.id("det_img_3949642")).getLocation().getY();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		selectJeans.click();
	}
	
}
