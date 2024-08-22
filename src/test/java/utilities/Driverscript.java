package utilities;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driverscript {

	static RemoteWebDriver driver;

	public static RemoteWebDriver WebDriverInitialization() {

		try {
			System.out.println("Driver Initialization");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			return driver;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException ("Failed to initate Chrome Driver");
		}
	}

	public static void WebDriverQuit() {

		System.out.println("Quitting the WebDriver");
		try {
			if(driver != null) {
				driver.quit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to Close the WebDriver.");
		}	

	}
}