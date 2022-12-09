package TestScriptsQues3And4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesFourRegisterAndScreenShot {

	public static void main(String[] args) {

		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
			driver.get("https://www.nopcommerce.com/en");
			Thread.sleep(1000);
			
			WebElement userIcon = driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'])[6]"));
			WebElement Register = driver.findElement(By.xpath("((//ul)[9]/li)[2]/a/span"));

			Actions act = new Actions(driver);
			act.moveToElement(userIcon);
			Thread.sleep(800);
			
			act.click(Register).build().perform();
			Thread.sleep(1000);
			
			WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
			WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
			WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
			WebElement ConfirmEmail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
			WebElement UserName = driver.findElement(By.xpath("//input[@id='Username']"));
			WebElement CheckAvailabilityBtn = driver.findElement(By.xpath("//input[@id='check-availability-button']"));
			WebElement Country = driver.findElement(By.xpath("//select[@id='CountryId']"));
			
			Select selCountry = new Select(Country);
			
			WebElement TimeZone = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
			
			Select selTimeZone = new Select(TimeZone);
			
			//WebElement NewsLetterChkBox = driver.findElement(By.xpath("//input[@id='Newsletter']"));
			WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));

			WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			WebElement MyCompany = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
			
			Select selMyCompany = new Select(MyCompany);
			
			WebElement RegisterBtn = driver.findElement(By.xpath("//input[@id='register-button']"));

			Thread.sleep(500);

			FirstName.sendKeys("Sourabh");
			Thread.sleep(500);
			LastName.sendKeys("Garde");
			Thread.sleep(500);
			Email.sendKeys("sourabh.garde.007@gmail.com");
			Thread.sleep(500);
			ConfirmEmail.sendKeys("sourabh.garde.007@gmail.com");
			Thread.sleep(500);
			UserName.sendKeys("SourabhVGarde00700abc");
			Thread.sleep(500);
			CheckAvailabilityBtn.click();
			Thread.sleep(500);
			selCountry.selectByVisibleText("Argentina");
			Thread.sleep(500);
			selTimeZone.selectByVisibleText("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
			Thread.sleep(500);
			//NewsLetterChkBox.click();
			Thread.sleep(500);
			Password.sendKeys("Sourabh@12345");
			Thread.sleep(500);
			ConfirmPassword.sendKeys("Sourabh@12345");
			Thread.sleep(500);
			selMyCompany.selectByVisibleText("I am student");
			Thread.sleep(500);
			RegisterBtn.click();
			
			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenShot, new File(".//ScreenShots//screenshot2.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
			driver.close();	
			
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
