package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		List<WebElement> link=driver.findElements(By.xpath("//div[@id=\"pageFooterChildren\"]/ul/li"));
		System.out.println("Size of link :: "+link.size());
		Actions mouse=new Actions(driver);
		
		for (WebElement Linkname : link) 
		{
		
			String LinkText=Linkname.getText();
			mouse.moveToElement(Linkname).build().perform();
			Thread.sleep(2000);
			System.out.println(LinkText);
		}
		
		driver.quit();
	}
}
