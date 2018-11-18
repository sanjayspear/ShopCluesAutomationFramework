package Script;

import org.testng.annotations.Test;

import POM.WarrantyCheckPage;
import generics.BaseTest;




public class WarrantyCheck extends BaseTest{
	
	@Test
	public void testWarranty()
	{
		WarrantyCheckPage wcpg=new WarrantyCheckPage(driver);
		wcpg.mouseOverMobileLink();
		wcpg.clickOnSamsungLink();
		wcpg.clickOnSamsungJ5Prime();
		wcpg.clickOnSpecification();
		wcpg.scrollToProductDetails();
		wcpg.goToSpecs();
	}

}
