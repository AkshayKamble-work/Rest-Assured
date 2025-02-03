package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {

	public static void main(String[] args) {
		// TagName[@AttributeName="AttributeValue"]
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// X path //TagName[text()='TextName']
		WebElement CreateNewAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAccountButton.click();

		// index // (TagName[@AttributeName="AttributeValue"])[Index])
		driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[2]")).click();
		driver.navigate().back();
		// TagName[contains(text(),'textName')]
		//a[contains(text(),'ગુજરાતી')]
		driver.findElement(By.xpath("//a[contains(text(),'ગુજરાતી')]")).click();
		driver.navigate().back();

		driver.quit();
	}
}
