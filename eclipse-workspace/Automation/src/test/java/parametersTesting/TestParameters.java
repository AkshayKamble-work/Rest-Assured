package parametersTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParameters {

	
	static WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Parameters({"Username","Password"})
	@Test
	public static void login(String Uname,String Upass)
	{
		WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userEmail.sendKeys(Uname);
		WebElement UserPassword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		UserPassword.sendKeys(Upass);
		
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		
		
		
	}
	@Test(dependsOnMethods = "login")
	public void applyLeave()
	{
		login("Admin", "admin123");
		WebElement applyLeaveBtn = driver.findElement(By.xpath("//button[@title=\"Apply Leave\"]"));
		applyLeaveBtn.click();
		driver.findElement(By.xpath("//a[text()='My Leave']")).click();
	}
	

	
	
	@AfterSuite
	public void CloseBrowser() throws InterruptedException

	{
		Thread.sleep(5000);	
		driver.close();
	}

}
