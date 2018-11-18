package Script;

import org.testng.annotations.Test;

import POM.InvalidMensJeansSelectionPage;
import generics.BaseTest;

public class InvalidMensJeansSelection extends BaseTest{
	
	@Test(priority=1)
	public void testMensJeansSelectionPage()
	{
		InvalidMensJeansSelectionPage pg=new InvalidMensJeansSelectionPage(driver);
		pg.mouseOverJeans();
		pg.clickOnJeans();
		pg.clickOnJeans();
	}

}
