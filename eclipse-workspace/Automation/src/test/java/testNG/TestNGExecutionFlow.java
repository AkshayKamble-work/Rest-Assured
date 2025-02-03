package testNG;



	import org.testng.annotations.*;

	public class TestNGExecutionFlow {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("@BeforeSuite: Executes before the entire suite.");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("@AfterSuite: Executes after the entire suite.");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("@BeforeTest: Executes before the <test> tag in TestNG XML.");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("@AfterTest: Executes after the <test> tag in TestNG XML.");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("@BeforeClass: Executes before the first method in the current class.");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("@AfterClass: Executes after all methods in the current class.");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("@BeforeMethod: Executes before each @Test method.");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("@AfterMethod: Executes after each @Test method.");
	    }

	    @Test
	    public void testMethod1() {
	        System.out.println("@Test: This is Test Method 1.");
	    }

	    @Test
	    public void testMethod2() {
	        System.out.println("@Test: This is Test Method 2.");
	    }
	}


