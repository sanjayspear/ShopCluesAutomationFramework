package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.PadometerPage;
import POM.SmartGadgetPage;
import generics.BasePage;

public class ValidSmartGadgetsBuy extends BasePage{
	@Test(priority=1)
	public void testSamrtGadgetsBuy()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkSmartGadget();
		SmartGadgetPage s= new SmartGadgetPage(driver);
		s.enterSearchBox();
		s.clkSearchBtn();
		s.clkPadometer();
		PadometerPage p = new PadometerPage(driver);
		p.enterPinCode("560014");
		p.clkCheck();
		p.clkBuy();
	}
		

}
