package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.ReachSecurePage;
import generics.BaseTest;

public class ValidReachSecureAddCart extends BaseTest {
	@Test(priority=1)
	public void testReachSecure()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkReachSecure();
		ReachSecurePage r= new ReachSecurePage(driver);
		r.clkColorBlack();
		r.enterPinCode("560097");
		r.clkCheck();
		r.clkAddCart();
		r.verifyCart();
	}

}
