package Script;

import org.testng.annotations.Test;

import POM.ValidJeansSelectPage;
import generics.BaseTest;



public class ValidJeansSelect extends BaseTest {
	@Test(priority=1)
	public void testJeansSelectionPage()
	{
		ValidJeansSelectPage vj=new ValidJeansSelectPage(driver);
		vj.mouseOverJeans();
		vj.clickOnJeans();
		vj.selectJeans();
		//vj.sleep(10);
		vj.enterZipCode();
		vj.sleep(5);
		vj.selectSize();
		vj.sleep(5);
		//vj.clickBuyNow();
		vj.clickCheck();
		vj.sleep(5);
		vj.zipCodeCheck();
		vj.sleep(5);
		
	}


}
