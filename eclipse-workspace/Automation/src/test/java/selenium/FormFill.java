package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFill {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement firstName=driver.findElement(By.id("firstName"));
		firstName.sendKeys("Akshay");
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.sendKeys("Kamble");
		WebElement Email=driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
		Email.sendKeys("Akshay.Kamble@Gmail.com");
		
List<WebElement> radioButtons = driver.findElements(By.id("gender-radio-1")); // Adjust 'name' to your HTML
        
        // Loop through and select a specific one (e.g., "Female")
        for (WebElement radioButton : radioButtons) {
            if (radioButton.getAttribute("value").equalsIgnoreCase("Male")) 
            {
                
            	Thread.sleep(3000);
            	try {
					radioButton.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("Selected: " + radioButton.getAttribute("value"));
                break;
            }
        }
		
		
	}
}
