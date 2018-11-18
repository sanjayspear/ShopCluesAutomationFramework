package Script;

import org.testng.annotations.Test;

import POM.MobileFullSpecificationPage;
import generics.BaseTest;




public class MobileFullSpecification extends BaseTest{
	
	@Test
	public void testMobileFullSpecification()
	{
		MobileFullSpecificationPage mpg=new MobileFullSpecificationPage(driver);
		mpg.mouseOverMobileLink();
		mpg.clickOnSamsungLink();
		mpg.clickOnSamsungJ7();
		mpg.clickOnSpecification();
		mpg.scrollToProductDetails();
		mpg.goToSpecs();
	}
	
}
