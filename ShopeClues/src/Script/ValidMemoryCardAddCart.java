package Script;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.MemoryCardPage;
import generics.BaseTest;


public class ValidMemoryCardAddCart extends BaseTest {
	@Test
	public void BuyMemoryCard()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkMemoryCard();
		MemoryCardPage p= new MemoryCardPage(driver);
		p.clkSamEv();
		p.clkAddCart();
		p.mousehover(driver);
		p.clkViewCart();
	}

}
