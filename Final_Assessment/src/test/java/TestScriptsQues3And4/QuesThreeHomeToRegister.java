package TestScriptsQues3And4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesThreeHomeToRegister {

	public static void main(String[] args) {

		try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			driver.get("https://www.nopcommerce.com/en");
			Thread.sleep(500);
			
			WebElement userIcon = driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'])[6]"));
			WebElement Register = driver.findElement(By.xpath("((//ul)[9]/li)[2]/a/span"));

			Actions act = new Actions(driver);
			act.moveToElement(userIcon);
			Thread.sleep(800);
			
			act.click(Register).build().perform();
			Thread.sleep(5000);
			
			driver.close();	
			
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
