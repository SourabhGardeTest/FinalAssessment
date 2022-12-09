package PO_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtRepManager;

public class QuestionSix {

	WebDriver driver;
	ExtentReports extReport;
	ExtentTest extTest;
	
	public QuestionSix(WebDriver driver) {
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
	@FindBy(how=How.XPATH, using = "((//ul)[1]/li)[3]")
	WebElement Product;
	@FindBy(how=How.XPATH, using = "(((//ul)[1]/li)[3]/ul/li)[1]")
	WebElement CategoryTab;
	
	@FindBy(how=How.XPATH, using = "((//table/tbody/tr)[1]/td)[6]/a[@href='https://products.pisystindia.com/Ecommerce/admin/category/edit/10']")
	WebElement updateCategory;
	
	@FindBy(how=How.XPATH, using = "((//table/tbody/tr)[1]/td)[6]/a[@href='https://products.pisystindia.com/Ecommerce/admin/category/editimage/10']")
	WebElement updateCategoryImage;
	
	@FindBy(how=How.XPATH, using = "//input[@id='category_name']")
	WebElement updateCategoryInput;
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']")
	WebElement updateCategoryUpdateBtn;
	
	@FindBy(how=How.XPATH, using = "//input[@id='inputFile-2']")
	WebElement updateCategoryImageInput;
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']")
	WebElement updateCategoryImageUpdateBtn;
	
	public void navigateToCategory() {
		try {
			Product.click();
			ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Products");
			Thread.sleep(500);
			CategoryTab.click();
			ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Category");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void UpdateCategoryName(String category) {
		navigateToCategory();
		updateCategory.click();
		ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Update");

		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		updateCategoryInput.clear();
		updateCategoryInput.sendKeys(category);
		ExtRepManager.extTest.log(LogStatus.INFO, "Enter In Category Name: "+category);

		updateCategoryUpdateBtn.click();
		ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Update");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	public void UpdateImage(String Image) {
		navigateToCategory();
		updateCategoryImage.click();
		ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Update Image");

		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		updateCategoryImageInput.sendKeys(Image);
		ExtRepManager.extTest.log(LogStatus.INFO, "Given Image: "+Image);

		updateCategoryImageUpdateBtn.click();
		ExtRepManager.extTest.log(LogStatus.INFO, "Clicked On Update");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}
