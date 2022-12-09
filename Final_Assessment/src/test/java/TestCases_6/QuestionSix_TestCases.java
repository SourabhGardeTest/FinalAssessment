package TestCases_6;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PO_5.QuestionFive;
import PO_6.QuestionSix;
import Utility.BrowserManager;
import Utility.ExtRepManager;

public class QuestionSix_TestCases {

	WebDriver driver;
	JSONObject QuesSixData;
	ExtentReports extReport;
	ExtentTest extTest;
	
	@BeforeClass
	public void beforeClassMethod() throws Exception{
		InputStream dataIs = null;
		
			
				try {
					String FileName = "Data6/QuesSix.json";
					dataIs = getClass().getClassLoader().getResourceAsStream(FileName);
					JSONTokener tokener = new JSONTokener(dataIs);
					
					QuesSixData = new JSONObject(tokener);
					System.out.println("Data:"+QuesSixData.toString());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
				ExtRepManager.createReport("Ecommerce Update Test Report");
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void beforeMethodSetup(String browser,String url) throws Exception{
		driver = BrowserManager.getDriver(browser);
		Thread.sleep(400);
		driver.manage().window().maximize();
		Thread.sleep(400);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
				
	}
	@Test(priority=0)
	public void validCouponLetters() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Update Name And Image");
		
		String email = QuesSixData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesSixData.getJSONObject("ValidSignIn").getString("Password");
		String categoryName = QuesSixData.getJSONObject("ValidUpdateData").getString("CategoryName");
		String newImage = QuesSixData.getJSONObject("ValidUpdateData").getString("NewImage");

		QuestionSix obj = PageFactory.initElements(driver, QuestionSix.class);
		obj.ValidSignIn(email, passwrd);
		obj.UpdateCategoryName(categoryName);
		obj.UpdateImage(newImage);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		ExtRepManager.extReport.endTest(extTest);
	}
	@AfterClass
	public void EndReport() {
		ExtRepManager.extReport.flush();
	}
	
}
