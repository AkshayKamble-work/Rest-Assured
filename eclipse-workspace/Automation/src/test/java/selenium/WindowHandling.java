package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		Set<String> mainwindow = driver.getWindowHandles();
		Iterator<String>it= mainwindow.iterator();
		String parentwin=it.next();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
