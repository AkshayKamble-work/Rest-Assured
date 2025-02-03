package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenshotParticular
{

	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String picture=RandomString.make(3);
		 WebElement element = driver.findElement(By.xpath("(//img[@title=\"redBus\"])[1]"));
		WebElement element2= driver.findElement(By.xpath("//h1[text()=\"India's No. 1 Online Bus Ticket Booking Site\"]"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =element.getScreenshotAs(OutputType.FILE);
		File des=new File("/Users/akshay/eclipse-workspace/Automation/Pic/"+picture+"--"+".jpg");
		FileUtils.copyFile(src, des);
		
		File Src =element2.getScreenshotAs(OutputType.FILE);
		File Des=new File("/Users/akshay/eclipse-workspace/Automation/Pic/"+picture+"--"+".jpg");
		FileUtils.copyFile(Src, Des);
		driver.close();
	}
}
