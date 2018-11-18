package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("---disable-notifications");
		driver= new ChromeDriver(option);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
