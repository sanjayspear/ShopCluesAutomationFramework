package POM;

import java.util.ArrayList;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;



public class HomePage extends BasePage{
	private WebDriver driver;

	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signUp;
	@FindBy(xpath="(//div[@class='actLink_heading'])[2]/a")
	private WebElement login;
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobiles;
	@FindBy(xpath="//a[.='All Mobile Phones']")
	private WebElement allMob;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement cart;
	@FindBy(xpath="//a[@class='notify_ic']")
	private WebElement notification;
	@FindBy(xpath="//ul[@id='4521']//a//img")
	private WebElement under4999;
	@FindBy(xpath="//a[.='Re-New Gadgets']")
	private WebElement reNewGadget;
	@FindBy(xpath="//a//strong[contains(.,'Feature phones ')]")
	private WebElement featurePhonet;
	@FindBy(xpath="//div//li[3]//a[.='Feature Phones']")
	private WebElement featurePhone;
	@FindBy(xpath="(//span[@class='slick-slide slick-active'])[3]")
	private WebElement ivoomiMob;
	@FindBy(xpath="(//a[.='Unboxed Mobiles']")
	private WebElement unBoxedPhone;
	@FindBy(xpath="//a[.='Refurbished Mobiles']")
	private WebElement refurbishedMob;
	@FindBy(xpath="//a[.='Under 999']")
	private WebElement under999;
	@FindBy(xpath="//li//li//a[.='Tablets']")
	private WebElement tablets;
	@FindBy(xpath="//a[.='Mobile Accessories']")
	private WebElement mobAccessories;
	@FindBy(xpath="//a[.='Memory Cards']")
	private WebElement memoryCard;
	@FindBy(xpath="//strong[.='VR Gear']")
	private WebElement vRGear;
	@FindBy(xpath="//a[.='Samsung']")
	private WebElement samsung;
	@FindBy(xpath="//a[.='Reach Secure']")
	private WebElement reachSecure;
	@FindBy(xpath="//*[@id='column_3']/ul/li[13]/a/strong")
	private WebElement smartGadgets;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}
	public void mousehoverSignUp(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(signUp).perform();
		
	}
	public void clkLogin()
	{
		login.click();
	}
	public void mousehover(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(mobiles).perform();
		
	}
	public void clkAllmob()
	{
	verifyElement(driver, ETO, allMob);
		allMob.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
		
	}

	public void mouseHoverNoti(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(notification).perform();
	}
	public void clkUnder4999()
	{
	verifyElement(driver, ETO, under4999);
		under4999.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}

	public void clkFeaturePhone()
	{
	verifyElement(driver, ETO, featurePhonet);
		featurePhonet.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkMOuseHovFeaturePhone()
	{
		verifyElement(driver, ETO, featurePhone);
		featurePhone.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	
	public void clkunboxedPhone()
	{
	verifyElement(driver, ETO, unBoxedPhone);
		unBoxedPhone.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkRefMOb()
	{
		verifyElement(driver, ETO, refurbishedMob);
		refurbishedMob.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkUnder999()
	{
		verifyElement(driver, ETO, under999);
		under999.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
	}
	public void clkTablests()
	{
		verifyElement(driver, ETO, tablets);
		tablets.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
	}
	public void clkMobAcc()
	{
		verifyElement(driver, ETO, mobAccessories);
		mobAccessories.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
		
	}
	public void clkMemoryCard()
	{
		verifyElement(driver, ETO, memoryCard);
		memoryCard.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));

		
	}
	public void clkVRGear()
	{
		verifyElement(driver, ETO, vRGear);
		vRGear.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		
	}
	public void clksamsung()
	{
		verifyElement(driver, ETO, samsung);
		samsung.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		
	}
	public void clkReachSecure()
	{
		verifyElement(driver, ETO, reachSecure);
		reachSecure.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		
	}
	public void clkSmartGadget()
	{
		verifyElement(driver, ETO, smartGadgets);
		smartGadgets.click();
		ArrayList<String> lst = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		
	}
	
	

}
