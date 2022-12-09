package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if(type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SG69837\\eclipse-workspace\\TestNG_Project\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
}
