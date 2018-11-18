package Script;

import org.testng.annotations.Test;

import POM.CallUsPage;
import generics.BaseTest;




public class CallUs extends BaseTest{
	
	@Test(priority=1)
	public void testCallUs()
	{
		CallUsPage cpg=new CallUsPage(driver);
		cpg.clickCallUsLink();
		cpg.sleep(1);
		cpg.setUserName();
		cpg.setPassword();
		cpg.clickLogin();
		cpg.clickSkip();
		cpg.clickContactUs();
		cpg.sleep(3);
		
	}

}
