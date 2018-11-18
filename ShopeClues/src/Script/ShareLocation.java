package Script;

import org.testng.annotations.Test;

import POM.ShareLoctionPage;
import generics.BaseTest;




public class ShareLocation extends BaseTest{
	
	@Test
	public void testShareLocation()
	{
		ShareLoctionPage slpg=new ShareLoctionPage(driver);
		slpg.clickLocationLink();
		slpg.enterLocation("560075");
		slpg.clickSubmit();
		slpg.matchLocation();
		
	}

}
