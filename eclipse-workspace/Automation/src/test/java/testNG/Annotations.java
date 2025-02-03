package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	public void SetUp() {
		System.out.println("@BeforeSuite setup system confign");
		}
		@BeforeMethod
		private void LaunchBrowser() {
		System.out.println("@BeofreMethod -- Launch Browser");
		}
		@BeforeTest
		public void LoginApp() {
		System.out.println("@BeofreTest -- Login Application");
		}
		@BeforeClass
		public void name() {
		System.out.println("@BeforeClass -- Enter URL");
		}
		// Post condition annotation
		@Test
		public void demo() {
		int i = 10 / 0;
		System.out.println(i);
		System.out.println("Demo");
		}
		@Test
		public void FacebookLogoTest1() {
		System.out.println("Facebook 1 logo verify");
		}
		@Test
		public void FacebookLogoTest2() {
		System.out.println("Facebook 2 logo verify");
		}
		@AfterMethod
		public void delecookies() {
		System.out.println("@AfteMethod -- DeleteCookies");
		}
		@AfterTest
		public void FacebookLogout() {
		System.out.println("@AfterTest -- FacebookLogout");
		}
		@AfterClass
		public void CloseBrower() {
		System.out.println("Afterclass -- Close browser");
		}
		@AfterSuite
		public void Logout() {
			System.out.println("@AfterSuite setup system confign");
		}
}
