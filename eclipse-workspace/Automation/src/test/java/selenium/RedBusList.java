package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("Pune");
		List<WebElement> City = driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		System.out.println("Total Count :: "+City.size());
		for (int i = 0; i <City.size(); i++)
		{
		
			String CityNames = City.get(i).getText();
			System.out.println(CityNames);
			if (CityNames.equals("Wakad"))
			{
			City.get(i).click();
			break;
			}
		}
		
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Latur");
		
	Thread.sleep(5000);
		List<WebElement> Destcity = driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		
		System.out.println("Total Count :: "+Destcity.size());
		for (int i = 0; i <Destcity.size(); i++)
		{
		
			String DestNames = Destcity.get(i).getText();
			System.out.println(DestNames);
			if (DestNames.equals("Ashoka Hotel"))
			{
			Destcity.get(i).click();
			break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		//driver.findElement(By.xpath("//text[text()='12 Dec']")).click();
		driver.findElement(By.id("search_button")).click();
		
	Thread.sleep(2000);
		driver.close();
	}
}
