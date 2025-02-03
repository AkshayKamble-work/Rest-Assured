package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class RadioButton {




	public static void main(String[] args) throws InterruptedException {
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Navigate to a sample radio button page
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Locate the male radio button
		List<WebElement> RadioButton = driver.findElements(By.name("sex"));
		System.out.println(RadioButton);
		System.out.println("Size of Radio button is "+RadioButton.size());
		//RadioButton.get(2).click();
	/*
		for (int i = 0; i < RadioButton.size(); i++)
		{
			RadioButton.get(i).click();
			Thread.sleep(3000);
		}
*/
		//Check if the radio button is displayed and enabled
	System.out.println(RadioButton.get(1).isDisplayed());

		System.out.println(RadioButton.get(1).isEnabled());
		RadioButton.get(1).click();
		Thread.sleep(3000);
		System.out.println(RadioButton.get(1).isSelected());
		// Close the browser

		Thread.sleep(5000);
		driver.quit();
	}
}



