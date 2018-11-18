package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.IvoomiPage;
import POM.MobilesPage;
import generics.BaseTest; 


public class ValidMobileBuy extends BaseTest {
	@Test(priority=1)
	public void BuyPhone()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkAllmob();
	
		MobilesPage m= new MobilesPage(driver);
		

		m.clkIvoomiMob();
		IvoomiPage i = new IvoomiPage(driver);
	
		i.clkGold();
		i.clkBuy();
	}
	

}
 