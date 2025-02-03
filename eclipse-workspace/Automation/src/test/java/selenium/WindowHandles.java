package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
		String mainWin=driver.getWindowHandle();
		Set<String>winID=driver.getWindowHandles();
		Iterator<String>its=winID.iterator();
		String ParentWindow = its.next();
		String ChildWindow=its.next();
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		String textline = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(textline);
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
