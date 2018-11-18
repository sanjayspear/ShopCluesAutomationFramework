package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;



public class SportsShoePage extends BasePage{
	private WebDriver driver;
	
	@FindBy(xpath="//a[.='Men']")
	private WebElement mensLink;
		
	@FindBy(xpath="//a[.='Sports Shoes']")
	private WebElement sportsShoeLink;
	
	@FindBy(xpath="//span[.='Nike']")
	private WebElement nikeLink;
	
	@FindBy(id="det_img_127591542")
	private WebElement shoeLink;
	
	@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/thumbnails/83477/50/50/127591542niketanjun812654010greywhite8126540102334111372921505120131.jpg']")
	private WebElement image1;
	
	@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/thumbnails/83477/50/50/127591542engplNikeTanjun812654010622531505120151.jpg']")
	private WebElement image2;
	
	@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/thumbnails/83477/50/50/127591542niketanjunmengreywhite8126540101505120144.jpg']")
	private WebElement image3;
	
	@FindBy(xpath="//img[@src='https://cdn.shopclues.com/images/thumbnails/83477/50/50/127591542niketanjun812654010greywhite8126540102334111372921505120138.jpg']")
	private WebElement image4;
	
	@FindBy(xpath="//div[@class='zoomLens']")
	private WebElement zoomImage;
	
	public SportsShoePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
		
	public void mouseOverMens()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mensLink).perform();
	}
	
	public void clickOnSportsShoe()
	{
		driver.switchTo().activeElement();
		sportsShoeLink.click();
	}
	
	public void selectNike()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		  
//		int x = driver.findElement(By.xpath("//img[@id='det_img_3949642']")).getLocation().getX();
//		int y = driver.findElement(By.xpath("//img[@id='det_img_3949642']")).getLocation().getY();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy("+x+","+y+")");
//			
//		Actions action=new Actions(driver);
//		action.moveToElement(nikeLink);
		nikeLink.click();
	}

	public void selectDesiredShoe()
	{
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		shoeLink.click();
	}
	
	public void browseShoeImages()
	{
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		image1.click();
		sleep(1);
		image2.click();
		sleep(1);
		image3.click();
		sleep(1);
		image4.click();
		sleep(1);
		image1.click();
	}
	
	public void zoomImage()
	{
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(zoomImage).perform();
	}

}
