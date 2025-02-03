package testNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FeatureInvocationCount {
	WebDriver driver;
	@Test (invocationCount = 2)
	public void login()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("Admin");
		WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

	}
	
	@Test(dependsOnMethods = "login")
	public void Close()
	{
		driver.quit();
	}

}
