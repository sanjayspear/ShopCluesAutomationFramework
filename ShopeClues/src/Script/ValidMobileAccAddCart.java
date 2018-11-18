package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.Iphone5sCoverCasePage;
import POM.MobileAccPage;
import generics.BaseTest;

public class ValidMobileAccAddCart extends BaseTest{
	@Test(priority=1)
	public void testMobAcc()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkMobAcc();
		MobileAccPage m= new MobileAccPage(driver);
		m.enterSearchContext();
		m.clkSearchBtm();
		m.clkcoverCase();
		Iphone5sCoverCasePage i = new Iphone5sCoverCasePage(driver);
		i.enterPinCode("560014");
		i.clkCheck();
		i.clkAddCart();
		i.verifyCart();
		
		
	}

}
