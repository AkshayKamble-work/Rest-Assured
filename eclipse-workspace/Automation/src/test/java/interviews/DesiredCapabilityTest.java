package interviews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilityTest {
	/*
	 DesiredCapabilities is a class used to configure various properties for a WebDriver instance.
	 It is primarily used to define the browser, platform,version and other options required for the test execution.
	 While DesiredCapabilities is now largely replaced by Options classes (like ChromeOptions, FirefoxOptions),
	 ***Where It Is Used:***
1)Specifying Browser Properties:

To specify the browser name, version, and platform.
2)Configuring Remote WebDriver:

Used to run tests on Selenium Grid or in a remote setup.
3)Enabling Specific Browser Features:

To enable/disable features like accepting insecure certificates or handling browser-specific options.
Custom Capabilities:

For adding custom properties required for specific environments.

	 */


	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("acceptInsecureCerts", true); // Accept insecure certificates


		// Set the path for chromedriver

		// Initialize WebDriver with DesiredCapabilities
		WebDriver driver = new ChromeDriver(capabilities);

		// Open a website
		driver.get("https://expired.badssl.com");

		// Print the page title
		System.out.println("Page title is: " + driver.getTitle());

	}


}


