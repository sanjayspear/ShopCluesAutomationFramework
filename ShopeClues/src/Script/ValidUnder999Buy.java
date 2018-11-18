package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import generics.BaseTest;



public class ValidUnder999Buy extends BaseTest{
	@Test
	public void BuyMemoryCard()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkUnder999();
	}

}
