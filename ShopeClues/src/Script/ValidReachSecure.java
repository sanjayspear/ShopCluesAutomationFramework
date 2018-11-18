package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.ReachSecurePage;
import generics.BaseTest;
import generics.CustomListner;
@Listeners(CustomListner.class)
public class ValidReachSecure extends BaseTest{
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
		r.clkBuy();
	}

}
