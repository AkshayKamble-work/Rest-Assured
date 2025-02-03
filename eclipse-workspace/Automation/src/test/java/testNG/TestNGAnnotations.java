package testNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void title()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Test ()
	public void VeriftyLogpresence()
	{
		WebElement CompanyLogo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		boolean logo = CompanyLogo.isDisplayed();
		System.out.println("Logo is dispalyed "+logo);
	}
	@Test ()
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("Admin");
		WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

	}

	@AfterSuite
	public void CloseBrowser() throws InterruptedException

	{
		Thread.sleep(5000);		driver.quit();
	}
}
