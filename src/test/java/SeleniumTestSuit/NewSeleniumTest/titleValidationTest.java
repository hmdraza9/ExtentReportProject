package SeleniumTestSuit.NewSeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class titleValidationTest extends testBase
{
	@Test
	public void IntitleValidationTest() {
				System.out.println("In titleValidationTest");
	}


	@BeforeTest
	public void browserConfig() throws InterruptedException{
		BrowserInitSetup();
	}
	
	@AfterTest
	public void browserRelease() {
		BrowserQuit();
	}

	
	@BeforeTest	public void b4Test() {
		System.out.println("titleValidationTest, before Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("titleValidationTest, after Test");
	}




	@BeforeMethod
	public void beforeMeth() {
		System.out.println("titleValidationTest, BeforeMethod");
	}

	@AfterMethod
	public void AfterMeth() {
		System.out.println("titleValidationTest, AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("titleValidationTest, after class");
	}


	@BeforeClass
	public void b4Class() {
		System.out.println("titleValidationTest, before class");
	}
}
