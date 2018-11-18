package Script;

import org.testng.annotations.Test;

import POM.SearchMobilesPage;
import generics.BaseTest;



public class SearchMobiles extends BaseTest{
	
	@Test
	public void testSearchMobiles()
	{
		SearchMobilesPage smpg=new SearchMobilesPage(driver);
		smpg.mouseOverMobileLink();
		smpg.clickAllMobilesLink();
		smpg.enterTextToSearch();
		smpg.checkPresenceofNote4();
		smpg.sleep(2);
	}

}
