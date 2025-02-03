package testNG;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FeatureDependsOn {

	
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

	@Test(dependsOnMethods = "VeriftyLogpresence")
	public void title()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Test 
	public void VeriftyLogpresence()
	{
		WebElement CompanyLogo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		boolean logo = CompanyLogo.isDisplayed();
		System.out.println("Logo is dispalyed "+logo);
	}
	@Test 
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("Admin");
		WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

	}
	@Test(dependsOnMethods = "login")
	public void tabs() throws InterruptedException
	{
		List<WebElement> leftTab = driver.findElements(By.xpath("//ul[@class=\"oxd-main-menu\"]/li"));
		System.out.println(leftTab);
	}

	@AfterSuite
	public void CloseBrowser() throws InterruptedException

	{
		Thread.sleep(5000);	
		driver.quit();
	}
}
