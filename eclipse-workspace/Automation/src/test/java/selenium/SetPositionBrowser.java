package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPositionBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fast.com/");
		Thread.sleep(3000);
		Point size=new Point(500, 500);
		driver.manage().window().setPosition(size);
		Thread.sleep(3000);
		Point BrowserSize = driver.manage().window().getPosition();
		System.out.println("Browser position ::"+BrowserSize);
		driver.quit();
	}
}
