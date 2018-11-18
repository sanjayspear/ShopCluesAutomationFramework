package Script;

import org.testng.annotations.Test;

import POM.SportsShoePage;
import generics.BaseTest;




public class SportsShoe extends BaseTest{
	
	@Test
	public void testSportsShoe()
	{
		SportsShoePage sspg=new SportsShoePage(driver);
		sspg.mouseOverMens();
		sspg.clickOnSportsShoe();
		sspg.selectNike();
		sspg.selectDesiredShoe();
		sspg.browseShoeImages();
		sspg.zoomImage();
		sspg.sleep(2);
	}
	

}
