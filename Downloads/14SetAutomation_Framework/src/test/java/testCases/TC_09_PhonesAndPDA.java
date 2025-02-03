package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Phones_PDAs_Page;
import testBase.BaseClass;
import utilities.ActionUtilities;

public class TC_09_PhonesAndPDA extends BaseClass {

	@Test
	public void VerifyPhone_PDA()
	{
		try {
			logger.info("***** Starting Test Case: TC09_PhonesAndPDATest *****");
			
			Phones_PDAs_Page page=new Phones_PDAs_Page(driver);
			page.phone_PDA();
			logger.info("Click on Phone and PDA link");
			
			page.HTC();
			logger.info("Click on HTC");
			page.addToCard();
			logger.info("Click on Add To Card button");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
}}
