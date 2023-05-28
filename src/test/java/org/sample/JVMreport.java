package org.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	public static void jvmReportGeneration(String jsonpath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\JVMReport");
		
		Configuration con = new Configuration(f, "Farfetch");
		con.addClassifications("chrome Version", "101.52");
		con.addClassifications("plateform", "Windows");
		con.addClassifications("version", "10");
		
		
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}
	
	
	
	
	
	
}
