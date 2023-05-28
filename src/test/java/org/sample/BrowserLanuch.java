package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLanuch extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		browserLanuch();
		
		lanuchUrl("https://www.facebook.com/");
		
		WebElement mailbox = driver.findElement(By.id("email"));
		passValue(mailbox,readcellValue("Courses", 0, 1) );
		
		WebElement passbox = driver.findElement(By.id("pass"));
		passValue(passbox, readcellValue("Details", 1, 0));
		
		

	}
	
}
