package TestCases_5;

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
import Utility.BrowserManager;
import Utility.ExtRepManager;

public class QuestionFive_TestCases {
	WebDriver driver;
	JSONObject QuesFiveData;
	ExtentReports extReport;
	ExtentTest extTest;
	
	@BeforeClass
	public void beforeClassMethod() throws Exception{
		InputStream dataIs = null;
		
			
				try {
					String FileName = "Data5/QuesFive.json";
					dataIs = getClass().getClassLoader().getResourceAsStream(FileName);
					JSONTokener tokener = new JSONTokener(dataIs);
					
					QuesFiveData = new JSONObject(tokener);
					System.out.println("Data:"+QuesFiveData.toString());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
				ExtRepManager.createReport("XLogist Add Coupon Test Report");
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
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Valid Coupon Letters");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("ValidCouponLetters").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.ValidAddCouponLetters(couponCode);
		
	}
	@Test(priority=1)
	public void validCouponNumbers() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Valid Coupon Numbers");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("ValidCouponNumbers").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.ValidAddCouponNumbers(couponCode);
		
	}
	@Test(priority=2)
	public void validCouponNumbersSpacesAndLetters() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Valid Coupon Numbers, Spaces And Letters");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("ValidCouponNumbersSpacesAndLetters").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.ValidAddCouponNumbersSpacesAndLetters(couponCode);
		
	}
	@Test(priority=3)
	public void validCouponExisting() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Valid Coupon Existing");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("ValidCouponExisting").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.ValidAddCouponLettersExisting(couponCode);
		
	}
	@Test(priority=4)
	public void InvalidCouponSpaces() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Spaces");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponSpaces").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponSpaces(couponCode);
		
	}
	@Test(priority=5)
	public void InvalidCouponBlank() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Blank");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponBlank").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponBlank(couponCode);
		
	}
	@Test(priority=6)
	public void InvalidCouponSpecCharsOnly() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Special Chars Only");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponSpecialCharsOnly").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponSpecCharsOnly(couponCode);
		
	}
	@Test(priority=7)
	public void InvalidCouponInsufficient() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Less Than Three chars");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponInsufficient").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponInsufficientChar(couponCode);
		
	}
	@Test(priority=8)
	public void InvalidCouponMoreCharacters() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon More Than 25 chars");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponInsufficient").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponMoreChar(couponCode);
		
	}
	@Test(priority=9)
	public void InvalidCouponSpecCharsAndLetters() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Special Chars And Letters");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponSpecialCharsAndLetters").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponSpecCharsAndLetters(couponCode);
		
	}
	@Test(priority=10)
	public void InvalidCouponSpecCharsAndNumbers() {
		ExtRepManager.extTest = ExtRepManager.extReport.startTest("Invalid Coupon Special Chars And Numbers");
		
		String email = QuesFiveData.getJSONObject("ValidSignIn").getString("Email");
		String passwrd = QuesFiveData.getJSONObject("ValidSignIn").getString("Password");
		String couponCode = QuesFiveData.getJSONObject("InValidCouponSpecialCharsAndNumbers").getString("CouponCode");
	
		QuestionFive obj = PageFactory.initElements(driver, QuestionFive.class);
		obj.ValidSignIn(email, passwrd);
		obj.InValidAddCouponSpecCharsAndNumbers(couponCode);
		
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
