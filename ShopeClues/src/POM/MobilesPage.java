package POM;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;



public class MobilesPage extends BasePage {
@FindBy(xpath="//a[.='Ivoomi Me2']")
private WebElement ivoomiMob;
@FindBy(xpath="(//div[@class='row cat_promotion_box'])[6]/h2")
private WebElement bestDealTab;
public MobilesPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void clkIvoomiMob()
{
	WebDriverWait wait = new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.visibilityOf(ivoomiMob));
	ivoomiMob.click();
	ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

	driver.switchTo().window(whs.get(2));
	

}
public void scrollToElement()
{
	JavascriptExecutor j = (JavascriptExecutor) driver;
	 Point y = driver.findElement(By.xpath("(//div[@class='row cat_promotion_box'])[6]/h2")).getLocation();
	 j.executeScript("window.scrollTo(0,"+y+")");
}
public void verifyEle()
{
	verifyElement(driver, ETO, ivoomiMob);
}

}
