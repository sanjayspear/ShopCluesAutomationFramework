package Script;

import org.testng.annotations.Test;

import POM.MyFeedbackPage;
import generics.BaseTest;


public class MyFeedback extends BaseTest {
	
	@Test(priority=1)
	public void testFeedback()
	{
		MyFeedbackPage fpg=new MyFeedbackPage(driver);
		fpg.mouseOverSignin();
		//fpg.sleep(10);
		fpg.clickfedback();
		//fpg.sleep(5);
		fpg.setUserName();
		fpg.setPassword();
		fpg.sleep(5);
		fpg.clickLogin();
		fpg.clickMyProfile();
		fpg.setLastName();
		fpg.clickUpdate();
		fpg.getCnfmsg();
	}

}
