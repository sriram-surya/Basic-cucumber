package org.run;
import org.sample.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",
glue = "org.step",
snippets = SnippetType.CAMELCASE,dryRun = false,
plugin = {"html:target","json:target//report//farfetch.json","junit:target//report//farf.xml","rerun:Rerun\\farfatch.txt"}
)




public class TestRunner {

	
	@AfterClass
	public static void JVMReportgeneration() {
		JVMreport.jvmReportGeneration(System.getProperty("user.dir")+"\\target\\report\\farfetch.json");

	}
}
