package interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchSafari 
{
	public static void main(String[] args) 
	{

		WebDriverManager.safaridriver().setup();
		// Check if SafariDriver is enabled
		try {
			// Create a new SafariDriver instance
			WebDriver driver = new SafariDriver();

			// Maximize the browser window
			driver.manage().window().maximize();

			// Open a URL
			driver.get("https://www.google.com");

			// Print the title of the page
			System.out.println("Page Title: " + driver.getTitle());

			// Close the browser
			//driver.quit();

		} catch (Exception e) 
		{
			System.out.println("Error: Ensure SafariDriver is enabled and Safari is up to date.");
			e.printStackTrace();
		}

	}
}
