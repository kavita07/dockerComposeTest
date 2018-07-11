/*
 * Date : 7/2/2018
 * Author : kavita
 */
		
package Dockerization.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class YourLogoTestNG{
	
	// this metho is to test click on signin button
	@Test(testName="TestNG Test")
	public void signInToYourLogo() throws MalformedURLException {

		//System.setProperty("webdriver.gecko.driver", "C:\\\\TestDrivers\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\\\TestDrivers\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
        capabilities.setCapability("networkConnectionEnabled", true);
        capabilities.setCapability("browserConnectionEnabled", true);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php");
		//WebElement signIn = driver.findElement(By.className("login"));
		//wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
	}

}
