package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		WebElement day=driver.findElement(By.id("day"));
		Select days=new Select(day);
		days.selectByIndex(5);
		Thread.sleep(5000);
		days.selectByValue("29");
		Thread.sleep(5000);
		days.selectByVisibleText("22");
		WebElement month=driver.findElement(By.id("month"));
		
		Select months=new Select(month);
		
		months.selectByIndex(1);
		Thread.sleep(5000);
		months.selectByValue("6");
		Thread.sleep(5000);
		months.selectByVisibleText("Oct");
		
		WebElement years=driver.findElement(By.id("year"));
		Select year=new Select(years);
		year.selectByIndex(8);
		Thread.sleep(5000);
		year.selectByValue("2003");
		Thread.sleep(5000);
		year.selectByVisibleText("1999");
		
		
		
		driver.quit();
	}
}
