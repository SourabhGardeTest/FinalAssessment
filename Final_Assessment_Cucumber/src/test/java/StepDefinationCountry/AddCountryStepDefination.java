package StepDefinationCountry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO_8.QuestionEight;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCountryStepDefination {

	public WebDriver driver;
	public QuestionEight obj1;
	
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj1 = new QuestionEight(driver);

	}

	@When("User Open the URL {string}")
	public void user_open_the_url(String url) {
	  driver.get(url);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("Enter Email as {string} and Password as {string}")
	public void enter_email_as_and_password_as(String email, String passwrd) {
	  obj1.ValidSignIn(email, passwrd);
	}

	@When("Click On Login")
	public void click_on_login() {
	  obj1.clickSignIn();
	}

	@When("User Click Location")
	public void user_click_location() {
	  obj1.clickLocation();
	}

	@When("User Click Country")
	public void user_click_country() {
	 obj1.clickCountryTab(); 
	}

	@When("User Click Add Country")
	public void user_click_add_city() {
	  obj1.clickAddCityBtn();
	}

	@When("Enter Country as {string}")
	public void enter_city_as(String string) {
	  obj1.EnterCity(string);
	}

	@When("Click on Add")
	public void click_on_add() {
	  obj1.clickAdd();
	}


	@Then("Closes Browser")
	public void closes_browser() {
	  driver.close();
	}
}
