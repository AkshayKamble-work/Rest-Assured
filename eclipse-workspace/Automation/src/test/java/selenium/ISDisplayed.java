package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ISDisplayed {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		if (email.isDisplayed())
		{
		email.sendKeys("Hello");	
		}
		else
		{
			System.out.println("Email is not Displayed");
		}
		
		WebElement loginButton=driver.findElement(By.name("login"));
		if (loginButton.isEnabled())
		{
			loginButton.click();
		}
		else {
			System.out.println(loginButton+ "Is not clickable");
		}
		WebElement pass = driver.findElement(By.id("pass"));
		if (pass.isSelected()) 
		{
			pass.sendKeys("QWETHGFHFH@");
		} else {
System.out.println("OOOpS,,,!!");
		}
		driver.quit();
	}
}
