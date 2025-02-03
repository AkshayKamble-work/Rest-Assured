package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTitle {

	public static void main(String[] args) {
		
		String title="Facebook – log in or sign up";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		if (driver.getTitle().equalsIgnoreCase(title))
		{
		System.out.println("Title is corredt");	
		}
		else
		{
			
			System.out.println("Title is incorrect");
		}
		driver.close();
	}
}
