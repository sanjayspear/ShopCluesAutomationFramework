package Script;

import org.testng.annotations.Test;

import POM.InvalidLocationPage;
import generics.BaseTest;



public class InvalidLocation extends BaseTest{
	
	@Test
	public void testInvalidLocation()
	{
		InvalidLocationPage ilpg=new InvalidLocationPage(driver);
		ilpg.clickLocationLink();
		ilpg.enterLocation("600000");
		ilpg.clickSubmit();
		ilpg.matchLocation();
		
	}

}
