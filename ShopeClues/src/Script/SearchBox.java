package Script;

import org.testng.annotations.Test;

import POM.SearchBoxPage;
import generics.BaseTest;


public class SearchBox extends BaseTest{
	
	@Test(priority=1)
	public void testSearchBox()
	{
		SearchBoxPage spg=new SearchBoxPage(driver);
		spg.enterTextInSearchBox();
		spg.clickSearchButton();
		spg.selectPriceFilter();
		
	}

}
