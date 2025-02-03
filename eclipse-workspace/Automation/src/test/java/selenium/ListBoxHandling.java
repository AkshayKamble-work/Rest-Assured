package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		String DOB="1/May/1993";
		String [] Date=DOB.split("/");
		Dropdown(Day, Date[0]);
		Dropdown(Month, Date[1]);
		Dropdown(Year, Date[2]);
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	public static void Dropdown(WebElement element,String Text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(Text);
	}
}
