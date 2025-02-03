package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




	import java.util.List;
	import java.util.concurrent.TimeUnit;

	public class WebTableRetrieval {

	    static WebDriver driver;

	    public static void getRowColNumber(String name) {
	        // Locate the table
	        WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));

	        // Get all rows in the table (excluding header row)
	        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

	        // Get the total number of columns (from the first row of data)
	        int colCount = rows.get(0).findElements(By.tagName("td")).size();
	        System.out.println("Total no. of Rows: " + rows.size());
	        System.out.println("Total no. of Columns: " + colCount);

	        // Traverse rows and columns
	        for (int i = 1; i <= rows.size(); i++) { // Start from 1 to skip the header row
	            List<WebElement> cols = rows.get(i - 1).findElements(By.tagName("td")); // Columns in the current row
	            for (int j = 1; j <= cols.size(); j++) {
	                String data = cols.get(j - 1).getText();
	                if (data.equals(name)) {
	                    System.out.println("Data found at Row: "+name +  i +  " , Column: " + j);
	                    return;
	                }
	            }
	        }
	        System.out.println("Data not found in the table.");
	    }

	    public static void main(String[] args) {

	        // Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        // Navigate to the webpage
	        driver.get("https://www.w3schools.com/html/html_tables.asp");

	        // Call the function to get row and column numbers of the specified data
	        getRowColNumber("Italy");

	        // Close the browser
	        driver.quit();
	    }
	}
