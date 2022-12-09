package PO_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtRepManager;

public class QuestionFive {

	WebDriver driver;
	ExtentReports extReport;
	ExtentTest extTest;
	
	public QuestionFive(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH, using = "//input[@id='useremail']")
	WebElement SignInEmail;
	@FindBy(how=How.XPATH, using = "//input[@id='password']")
	WebElement SignInPassword;

	@FindBy(how=How.XPATH, using = "//form/button")
	WebElement SignInBtn;
	
	public void ValidSignIn(String email,String passwrd) {
		SignInEmail.sendKeys(email);
		ExtRepManager.extTest.log(LogStatus.INFO, "Entered Email:"+email);
		SignInPassword.sendKeys(passwrd);
		ExtRepManager.extTest.log(LogStatus.INFO, "Entered Password:"+passwrd);
		SignInBtn.click();
		ExtRepManager.extTest.log(LogStatus.INFO, "Clicked Sign In");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@FindBy(how=How.XPATH, using = "//li//a[@href='https://xlogist.pisystindia.com/mainhub/promocode']")
	WebElement CouponTab;
	
	@FindBy(how=How.XPATH, using = "//div/a[@href='https://xlogist.pisystindia.com/mainhub/promocode/add']")
	WebElement AddCouponMain;
	
	@FindBy(how=How.XPATH, using = "//input[@id='coupon_name']")
	WebElement EnterCouponCode;
	
	@FindBy(how=How.XPATH, using = "//div[@class='col-sm-offset-2 col-sm-10']/button")
	WebElement AddBtn;
	
	public void goToAddCouponAndAdd(String cpnCde) {
		try {
			CouponTab.click();
			ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Coupon Tab");
			Thread.sleep(1000);
			AddCouponMain.click();
			ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Add Coupon");
			Thread.sleep(1000);
			EnterCouponCode.sendKeys(cpnCde);
			ExtRepManager.extTest.log(LogStatus.INFO, "Entered into Coupon Code: ",cpnCde);
			Thread.sleep(1000);
			AddBtn.click();
			ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Add");
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ValidAddCouponLetters(String couponCode) {
		goToAddCouponAndAdd(couponCode);
	}
	public void ValidAddCouponNumbers(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void ValidAddCouponNumbersSpacesAndLetters(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void ValidAddCouponLettersExisting(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponSpaces(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponBlank(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponSpecCharsOnly(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponSpecCharsAndLetters(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponSpecCharsAndNumbers(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponInsufficientChar(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	public void InValidAddCouponMoreChar(String couponCode) {
		goToAddCouponAndAdd(couponCode);

	}
	

}
