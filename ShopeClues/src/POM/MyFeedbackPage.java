package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;



public class MyFeedbackPage extends BasePage {
		private WebDriver driver;
		
		@FindBy(xpath="//a[.='Sign In']")
		private WebElement signinLink;
		
		@FindBy(xpath="//a[.='My Feedback']")
		private WebElement feedbackLink;
		
		@FindBy(id="main_user_login")
		private WebElement userNameTB;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement passwordTB;
		
		@FindBy(id="login_button")
		private WebElement loginBtn;
		
		@FindBy(xpath="//a[.='My Profile']")
		private WebElement myProfileLink;
		
		@FindBy(id="lastname")
		private WebElement lastNameTB;
		
		@FindBy(id="save_profile_but")
		private WebElement updateBTN;
		
		@FindBy(xpath="//div[(contains(.,'Profile has been updated successfully.'))]")
		private WebElement cnfMsg;

		public MyFeedbackPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		
		public void mouseOverSignin()
		{
			Actions action= new Actions(driver);
			action.moveToElement(signinLink).perform();
			
		}
		
		public void clickfedback()
		{
			feedbackLink.click();
		}
		
		public void setUserName()
		{
			userNameTB.sendKeys("parasaranajoy@gmail.com");
		}
		
		public void setPassword()
		{
			passwordTB.sendKeys("paras@90");
		}
		
		public void clickLogin()
		{
			loginBtn.click();
		}
		
		public void clickMyProfile()
		{
			
			myProfileLink.click();
		}
		
		public void setLastName()
		{
			lastNameTB.sendKeys("Kumar");
		}
		
		public void clickUpdate()
		{
			updateBTN.click();
		}
		
		public void getCnfmsg()
		{
			cnfMsg.getText();
			if(cnfMsg.getText()=="Profile has been updated successfully.")
				Reporter.log("Pass",true);
			else
				Reporter.log("Fail",true);
			
		}


}
