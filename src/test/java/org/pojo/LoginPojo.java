package org.pojo;

import javax.print.event.PrintJobAttributeEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@title='Login page.']")
	private WebElement loginIcon;
	
	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement emailbox;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordBox;
	
	@FindBy(xpath = "(//button[text()='Sign In'])[3]")
	private WebElement singinBtn;

	public WebElement getLoginIcon() {
		return loginIcon;
	}

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public WebElement getSinginBtn() {
		return singinBtn;
	}  
	
	
	
}
