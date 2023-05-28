package org.step;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.pojo.LoginPojo;
import org.sample.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Farfatch_StepDefinition extends BaseClass {

//	@Given("user has to lunch the browser and the requried url")
//	public void userHasToLunchTheBrowserAndTheRequriedUrl() {
//	   browserLanuch();
//	   lanuchUrl("https://www.farfetch.com/in/shopping/women/items.aspx");
//	}
//
//	@When("User has to enter the value in user name and password fied")
//	public void userHasToEnterTheValueInUserNameAndPasswordFied() {
//	   LoginPojo l = new LoginPojo();
//	   l.getLoginIcon().click();
//	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	   l.getEmailbox().sendKeys("wwwefg@gmail.com");
//	   l.getPasswordBox().sendKeys("123456789");
//	}
//
//	@When("user has to click the login button")
//	public void userHasToClickTheLoginButton() {
//	   LoginPojo l1 = new LoginPojo();
//	   l1.getSinginBtn().click();
//	}
//
//	@Then("incorrect login value sholud be shown in the screen")
//	public void incorrectLoginValueSholudBeShownInTheScreen() {
//	 System.out.println("Done");  
//	}
////=============================================================================================
//	@Given("user has to launch the browser and url")
//	public void userHasToLaunchTheBrowserAndUrl() {
//	    browserLanuch();
//	    lanuchUrl("https://www.farfetch.com/in/shopping/women/items.aspx");
//	}
//
//	@When("user has to click the login icon")
//	public void userHasToClickTheLoginIcon() {
//	  LoginPojo l2 = new LoginPojo();
//	  clickaction(l2.getLoginIcon());
//	  
//	}
//
//	@When("user has to enter the data in username and password box")
//	public void userHasToEnterTheDataInUsernameAndPasswordBox() {
//		  LoginPojo l3 = new LoginPojo();
//		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	    passValue(l3.getEmailbox(), "srirmsurya97@gmail.com");
//	    passValue(l3.getPasswordBox(), "123456789");
//	}
//
//	@Then("incorrect login or password sholud be shown in the screen")
//	public void incorrectLoginOrPasswordSholudBeShownInTheScreen() {
//	   System.out.println("done");
//	}
//	@Given("user has to lunch the browser and the requried url")
//	public void userHasToLunchTheBrowserAndTheRequriedUrl() {
//		browserLanuch();0
	
//		lanuchUrl("https://www.farfetch.com/in/shopping/women/items.aspx");
//	}
//
	@When("user has to click login icon")
	public void userHasToClickLoginIcon() {
		LoginPojo l = new LoginPojo();
		l.getLoginIcon().click();
	}
 
	@When("User has to enter the value in username and password")
	public void userHasToEnterTheValueInUsernameAndPassword(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> map = d.asMaps();
		Map<String, String> m = map.get(1);
		String user = m.get("username");
		String pass = m.get("password");
		 LoginPojo l = new LoginPojo();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 l.getEmailbox().sendKeys(user);
		 l.getPasswordBox().sendKeys(pass);
	}
//	@When("User has to enter the value in {string} and {string}")
//	public void userHasToEnterTheValueInAnd(String user, String pass) {
//	   LoginPojo l = new LoginPojo();
//	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	   passValue(l.getEmailbox(), user);
//	   passValue(l.getPasswordBox(), pass);
//	}

	@When("user has to click the login button")
	public void userHasToClickTheLoginButton() {
		LoginPojo l = new LoginPojo();
		l.getSinginBtn().click();
	}

	@Then("incorrect login value sholud be shown in the screen")
	public void incorrectLoginValueSholudBeShownInTheScreen() {

		System.out.println("successful");

	}
}