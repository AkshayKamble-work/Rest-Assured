package interviews;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAmezon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Launch Amazon
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.amazon.in/");


		// Wait until the left filter panel is loaded
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement filterPanel = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("s-refinements"))
				);

		// Find all checkboxes within the filter panel
		List<WebElement> checkboxes = filterPanel.findElements(By.xpath(".//li//input[@type='checkbox']"));

		// Iterate through each checkbox and print its label and value
		for (WebElement checkbox : checkboxes) {
			// Get the label text (located after the checkbox)
			WebElement labelElement = checkbox.findElement(By.xpath("./following-sibling::span"));
			String label = labelElement.getText();

			// Get the value attribute of the checkbox
			String value = checkbox.getAttribute("value");

			// Print label and value
			System.out.println("Label: " + label + ", Value: " + value);

			// Optionally, click a checkbox (uncomment the next line to enable)
			// checkbox.click();

		}
	}



}
