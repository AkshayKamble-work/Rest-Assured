package PageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Phones_PDAs_Page extends BasePage {

	public Phones_PDAs_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	WebElement phonesAndPDA;
	
	@FindBy(partialLinkText = "HTC Touch HD")
	WebElement HTCTounch;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
WebElement AddToCard;
	
	public void phone_PDA()
	{
		phonesAndPDA.click();
	}
	
	public void HTC()
	{
		HTCTounch.click();
	}
	
	public void addToCard()
	{
		AddToCard.click();
	}
}
