package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]"));
		 // Get all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through rows and columns
        for (int i = 0; i < rows.size(); i++) 
        {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) 
            {
                System.out.print(columns.get(j).getText() + " || ");
            }
            System.out.println(); // Move to the next line after each row
        }
		Thread.sleep(5000);
		driver.close();
	}
}
