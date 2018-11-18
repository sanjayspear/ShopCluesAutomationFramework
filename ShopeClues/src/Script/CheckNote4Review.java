package Script;

import org.testng.annotations.Test;

import POM.CheckNote4ReviewsPage;
import generics.BaseTest;



public class CheckNote4Review extends BaseTest{
	
	@Test
	public void testCheckNote4Reviews()
	{
		CheckNote4ReviewsPage rpg=new CheckNote4ReviewsPage(driver);
		rpg.mouseOverMobileLink();
		rpg.clickAllMobilesLink();
		rpg.enterTextToSearch();
		rpg.clickOnNote4();
		rpg.clickOnReviews();
		rpg.getStarRatings();
	}

}
