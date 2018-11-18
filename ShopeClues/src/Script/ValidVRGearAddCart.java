package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.IBSGlass3DPage;
import POM.VRGearPage;
import generics.BaseTest;
import generics.CustomListner;


@Listeners(CustomListner.class)
public class ValidVRGearAddCart extends BaseTest {
	@Test(priority=1)
	public void testVRGearPage()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkVRGear();
		VRGearPage v= new VRGearPage(driver);
		v.enterSearchBox();
		v.clkSearchBtn();
		v.clkIBSGlass3D();
		IBSGlass3DPage i = new IBSGlass3DPage(driver);
		i.enterPinCode("560014");
		i.clkCheck();
		i.clkBuy();
	}
	

}
