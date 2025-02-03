package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.safaridriver().setup();
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> Links=driver.findElements(By.xpath("//div[@id=\"pageFooterChildren\"]/ul/li"));
		System.out.println("Total Links on page :: "+Links.size());
		System.out.println();
		Actions mouse=new Actions(driver);
		
		for (WebElement linkname : Links)
		{
		
			String linkText = linkname.getText();
				System.out.println(linkText);
				mouse.moveToElement(linkname).build().perform();
				
		
			Thread.sleep(2000);
			
			
		}
	
		driver.quit();
		
	}
}
