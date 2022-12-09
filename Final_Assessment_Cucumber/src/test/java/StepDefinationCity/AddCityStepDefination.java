package StepDefinationCity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO_7.QuestionSeven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCityStepDefination {

	public WebDriver driver;
	public QuestionSeven obj1;
	
	
	@Given("Open chrome browser")
	public void open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj1 = new QuestionSeven(driver);

	}

	@When("User Opens the URL {string}")
	public void user_opens_the_url(String url) {
	  driver.get(url);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("Enters Email as {string} and Password as {string}")
	public void enters_email_as_and_password_as(String email, String passwrd) {
	  obj1.ValidSignIn(email, passwrd);
	}

	@When("Clicks On Login")
	public void clicks_on_login() {
	  obj1.clickSignIn();
	}

	@When("User Clicks Location")
	public void user_clicks_location() {
	  obj1.clickLocation();
	}

	@When("User Clicks City")
	public void user_clicks_city() {
	 obj1.clickCityTab(); 
	}

	@When("User Clicks Add City")
	public void user_clicks_add_city() {
	  obj1.clickAddCityBtn();
	}

	@When("Enters City as {string}")
	public void enters_city_as(String string) {
	  obj1.EnterCity(string);
	}

	@When("Clicks on Add")
	public void clicks_on_add() {
	  obj1.clickAdd();
	}


	@Then("Close Browser")
	public void close_browser() {
	  driver.close();
	}
}
