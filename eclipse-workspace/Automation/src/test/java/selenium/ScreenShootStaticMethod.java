package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShootStaticMethod {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();
		GetScreenshot("Pic");
		
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void GetScreenshot(String capture) throws IOException
	{
		
		String Random=RandomString.make(1);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("/Users/akshay/eclipse-workspace/Automation/Pic/"+capture+"--"+Random+".jpg");
		FileUtils.copyFile(source, Destination);
	}
}
