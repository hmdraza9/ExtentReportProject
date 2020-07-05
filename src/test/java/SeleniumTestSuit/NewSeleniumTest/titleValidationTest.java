package SeleniumTestSuit.NewSeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class titleValidationTest extends testBase
{
	@Test
	public void helloDear() {
//		System.out.println("titleValidationTest, Hello there!");
		int a=1+2;
		a=a*a;
	}

	@BeforeTest
	public void b4Test() {
		System.out.println("titleValidationTest, before Test");
	}
	

	@AfterTest
	public void AfterTest() {
		System.out.println("titleValidationTest, after Test");
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
