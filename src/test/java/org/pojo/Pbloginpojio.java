package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Pbloginpojio extends BaseClass{
public Pbloginpojio() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//span[text()='Account']")
private WebElement Accountbtn ;


@FindBy(xpath="//a[text()='Sign In']")
private WebElement singinbtn ;

@FindBy(id="login-email")
private WebElement emailbox ;

@FindBy(id="login-password")
private WebElement passbox ;

@FindBy(id="btn-sign-in")
private WebElement singinbutton2 ;



public WebElement getAccountbtn() {
	return Accountbtn;
}

public WebElement getSinginbtn() {
	return singinbtn;
}

public WebElement getEmailbox() {
	return emailbox;
}

public WebElement getPassbox() {
	return passbox;
}

public WebElement getSinginbutton2() {
	return singinbutton2;
}








}
