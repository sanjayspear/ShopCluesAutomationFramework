package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.SamsungBrandPage;
import POM.SamsungGalJ7Page;
import generics.BaseTest;

public class ValidBrandSamsung extends BaseTest{
	@Test(priority=1)
	public void testBrandSamsung()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clksamsung();
		SamsungBrandPage s= new SamsungBrandPage(driver);
		s.enterSearchContext();
		s.clkSearch();
		s.clkSamsungGalJ7();
		SamsungGalJ7Page v= new SamsungGalJ7Page(driver);
		v.enterPinCode("560014");
		v.clkCheck();
		v.clkBuy();
	}

}
