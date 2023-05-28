package org.step;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.sample.BaseClass;
import org.sample.BrowserLanuch;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void loginicon() {
		browserLanuch();
		lanuchUrl("https://www.farfetch.com/in/shopping/women/items.aspx");
		System.out.println("Before Screenshot");
   
	}
	
   @io.cucumber.java.After
   public void Takescreensh(Scenario s) throws IOException {
	   
	   if (s.isFailed()) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshot, "img/png");
	}
	   String name = s.getName();
	   String file = name.replace(" ", "_");
	   takeScreenshot(file);
	System.out.println("After Screenshot");

	driver.quit();
}
	
}
