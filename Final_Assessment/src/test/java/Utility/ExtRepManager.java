package Utility;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtRepManager {
	public static ExtentReports extReport;
	public static ExtentTest extTest;
	
	public static void createReport(String reportName) {
		
		Date dte= new Date();
		String time = dte.getTime()+"";
		extReport = new ExtentReports(System.getProperty("user.dir")+"/target/data-output/"+reportName+"_"+time+".html");
	
	}
	public static void startTest(String testName) {
		extTest=extReport.startTest(testName);
	}
}
