package PO_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class QuestionSeven {

	WebDriver driver;
	public QuestionSeven(WebDriver driver) {
        PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using = "//input[@id='useremail']")
	@CacheLookup
	WebElement Email;
	
	@FindBy(how=How.XPATH, using = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(how=How.XPATH, using = "//form/button")
	@CacheLookup
	WebElement SignInBtn;
	
	public void ValidSignIn(String email,String passwrd) {
		
		Email.sendKeys(email);
		Password.sendKeys(passwrd);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public void clickSignIn() {
		SignInBtn.click();
	}
	
	@FindBy(how=How.XPATH, using = "((//ul)[1]/li)[2]")
	@CacheLookup
	WebElement Location;
	public void clickLocation() {
		Location.click();
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(how=How.XPATH, using = "(((//ul)[1]/li)[2]/ul/li)[3]")
	@CacheLookup
	WebElement CityTab;
	public void clickCityTab() {
		CityTab.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(how=How.XPATH, using = "//div/a[@href='https://products.pisystindia.com/Ecommerce/admin/city/add']")
	@CacheLookup
	WebElement AddCityBtn;
	public void clickAddCityBtn() {
		AddCityBtn.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	@FindBy(how=How.XPATH, using = "//input[@id='city']")
	@CacheLookup
	WebElement CityInput;
	public void EnterCity(String city) {
		CityInput.sendKeys(city);
	}
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']")
	@CacheLookup
	WebElement AddCitySubmitBtn;
	public void clickAdd() {
		AddCitySubmitBtn.click();
	}
	
	
	
	
	
	
}
