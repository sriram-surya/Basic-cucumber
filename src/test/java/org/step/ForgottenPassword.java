package org.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ForgottenPassword extends BaseClass{

	@When("user has to click the forgotten password")
	public void userHasToClickTheForgottenPassword() {
		driver.findElement(By.xpath("//button[@title='Login page.']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Forgot your password?']")).click();
	}

	@When("user has to enter the required email id {string} and click reset password icon")
	public void userHasToEnterTheRequiredEmailIdAndClickResetPasswordIcon(String gmail) { 
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(gmail);
	}
	
//	@When("user has to click the forgotten password")
//	public void userHasToClickTheForgottenPassword() {
//	    
//	}
//	
//	@Given("user has to pass the new password {string}")
//	public void userHasToPassTheNewPassword(String string) {
//	
//	}

//	@When("user has to enter the required email id {string } and click reset password icon")
//	public void userHasToEnterTheRequiredEmailIdAndClickResetPasswordIcon(String gmail) {
//	  
//	}

//	@When("user has to enter the password reset link")
//	public void userHasToEnterThePasswordResetLink() {
//	    
//	}
//
//	@When("user has to pass the new password {string}")
//	public void userHasToPassTheNewPassword(String string) {
//	    
//	}
}
