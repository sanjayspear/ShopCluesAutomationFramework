package Script;

import org.testng.annotations.Test;

import POM.BuyJeansPage;
import generics.BaseTest;


public class BuyJeans extends BaseTest{
	
	@Test
	public void testBuyJeans()
	{
		BuyJeansPage bjpg=new BuyJeansPage(driver);
		bjpg.mouseOverJeans();
		bjpg.clickOnJeans();
		bjpg.selectJeans();
		bjpg.selectSize();
		bjpg.clickBuyNow();
		bjpg.setUserName();
		bjpg.setPassword();
		bjpg.sleep(2);
		bjpg.clickLogin();
		
		//bjpg.clickSkip();
		bjpg.sleep(2);
	}

}
