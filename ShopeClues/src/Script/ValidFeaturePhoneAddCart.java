package Script;

import org.testng.annotations.Test;

import POM.FeaturePhonePage;
import POM.HomePage;
import POM.InovuI7Page;
import generics.BaseTest;

public class ValidFeaturePhoneAddCart extends BaseTest {
	@Test
	public void BuyFeaturePhone()
	{
	HomePage h = new HomePage(driver);
	h.mousehover(driver);
	h.clkFeaturePhone();
	FeaturePhonePage f= new FeaturePhonePage(driver);
	f.enterContextInScrBar();
	f.clkSearchBtn();
	f.clkinovui7Mob();
	InovuI7Page i = new InovuI7Page(driver);
	i.clkculBlack();
	i.enterPinCode("560097");
	i.clkcheck();
	i.clkAddCart();
	}

}
