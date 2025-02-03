package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement CreateNewAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAccountButton.click();

		WebElement days = driver.findElement(By.id("day"));
		// how get the total no size of list
		Select selectDay=new Select(days);
		List<WebElement> DayOptions = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		List<WebElement> daylist = selectDay.getOptions();
		System.out.println("Total days :: "+daylist.size());

		// how will print all the value from dropdown
		for (int i = 0; i < daylist.size(); i++)
		{

			String DayCount = daylist.get(i).getText();
			System.out.println(DayCount);
			// how to select u select specific value from dropdown
			if (DayCount.equals("12"))
			{
				daylist.get(i).click();	
			}
		}
		Thread.sleep(5000);
		WebElement months = driver.findElement(By.id("month"));
		Select s2=new Select(months);
		List<WebElement> MonthOption = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));

		List<WebElement> monthValues = s2.getOptions();
		System.out.println("Month Count value is :: "+monthValues.size());

		for (int i = 0; i < monthValues.size(); i++)
		{
			String CountMonth = monthValues.get(i).getText();

			System.out.println("Month Name :: "+CountMonth);
			if (CountMonth.equals("Jan")) 
			{
				monthValues.get(i).click();	
			}

		}
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		List<WebElement> Yearslist = s3.getOptions();
		System.out.println("Years count :: "+Yearslist.size());

		for (int i = 0; i <Yearslist.size(); i++)
		{

			String yearcount = Yearslist.get(i).getText();

			System.out.println("Years :: "+yearcount);
			if (yearcount.equals("2015")) 
			{
				Yearslist.get(i).click();
			}

		}
		driver.quit();
	}
}
