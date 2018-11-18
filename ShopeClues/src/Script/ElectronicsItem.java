package Script;

import org.testng.annotations.Test;

import POM.ElectronicsItemPage;
import generics.BaseTest;



public class ElectronicsItem extends BaseTest{
	
	@Test
	public void testElectronics()
	{
		ElectronicsItemPage eipg=new ElectronicsItemPage(driver);
		eipg.mouseOverElectronics();
		eipg.clickOnPenDrives();
		eipg.selectPenDrive();
		eipg.getReviewCount();
	}

}
