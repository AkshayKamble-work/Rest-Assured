package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Web site
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Vamsi");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rentala");
		Thread.sleep(3000);
		//List<WebElement> list = driver.findElements(By.xpath("//select[@id=\"day\"]"));
		WebElement Day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s=new Select(Day);
		s.selectByIndex(10);
		
		WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));// Birth Month select

		Select s1=new Select(Month);
		s1.selectByIndex(3);// select birth month
		Thread.sleep(4000);
		WebElement Year=driver.findElement(By.xpath("//select[@id=\"year\"]")); // BirthYear select
		Select s3=new Select(Year);
		s3.selectByVisibleText("1998");// select birth year
		
		WebElement Sex=driver.findElement(By.xpath("//input[@value=\"2\"]"));// select male sex
		Sex.click();
		WebElement Email=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));// send email id in email field
		Email.sendKeys("Vamsi.Rentala@Gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));// Put password in password field
		Password.sendKeys("1234567890test");
		
		WebElement SignupButton=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));// Click on SignupButton
		SignupButton.click();
		Thread.sleep(5000);
		driver.quit();// to close the browser
	}
}
