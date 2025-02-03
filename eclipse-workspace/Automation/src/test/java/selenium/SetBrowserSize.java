package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetBrowserSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fast.com/");
		Thread.sleep(3000);
		Dimension size=new Dimension(800, 700);
		driver.manage().window().setSize(size);
		Thread.sleep(3000);
		Dimension BrowserSize = driver.manage().window().getSize();
		System.out.println("BrowserSize ::"+BrowserSize);
		driver.quit();
	}
}
