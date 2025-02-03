package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAlert {
public static void main(String[] args) throws InterruptedException 

{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().accept();// click on Okay button in alert
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().sendKeys("Hello");
	driver.switchTo().alert().accept();
	driver.quit();
}

}
