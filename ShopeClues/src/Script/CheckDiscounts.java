package Script;

import org.testng.annotations.Test;

import POM.CheckDiscountsPage;
import generics.BaseTest;



public class CheckDiscounts extends BaseTest{
	
	@Test
	public void testDiscount()
	{
		CheckDiscountsPage cdpg=new CheckDiscountsPage(driver);
		cdpg.mouseOverJeans();
		cdpg.clickOnJeans();
		cdpg.selectJeans();
		cdpg.getOffersText();
	}

}
