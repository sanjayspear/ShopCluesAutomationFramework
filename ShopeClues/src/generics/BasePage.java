package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage implements IAutoConst {
	public WebDriver driver;

	public void verifyTitle(WebDriver driver, String title) {
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, aTitle);
	}

	public void verifyElement(WebDriver driver, long time, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, ETO);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present", true);
		} catch (Exception e) {
			Reporter.log("Element not found", true);
			Assert.fail();
		}

	}
	public void sleep(int i)
	{
		try
		{
			Thread.sleep(i*1000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
