package Script;

import org.testng.annotations.Test;

import POM.CheckOffersPage;
import generics.BaseTest;



public class CheckOffers extends BaseTest{
	
	@Test
	public void testOffers()
	{
		CheckOffersPage cpg= new CheckOffersPage(driver);
		cpg.mouseOverJeans();
		cpg.clickOnJeans();
		cpg.selectJeans();
		cpg.getOffersText();
	}

}
