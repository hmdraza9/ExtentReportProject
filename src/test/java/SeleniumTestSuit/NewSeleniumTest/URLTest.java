package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class URLTest extends testBase
{
	
	@BeforeTest
	public void browserConfig() throws InterruptedException, IOException {
		BrowserInitSetup();
	}
	
	@AfterTest
	public void browserRelease() {
		BrowserQuit();
	}


	@Test
	public void InURLTest() {
				System.out.println("In URLTest");
	}
	
	@Test
	public void Google() throws IOException {
		openGoogle();
	}
	
	@Test
	public void InCom() throws IOException {
		openInDotCom();
	}

	@Test
	public void Yahoo() throws IOException {
		openYahoo();
	}
	
	@Test
	public void ToolsQA() throws IOException {
		openToolsQA();
	}
	
	@Test
	public void Guru99() throws IOException {
		openGuru99demo();
	}

	@BeforeMethod
	public void beforeMeth() {
    	System.out.println("Url test, BeforeMethod");
	}

	@AfterMethod
	public void AfterMeth() {
    	System.out.println("Url test, AfterMethod");
	}
	
	
	@AfterClass
	public void classEnds() {
    	System.out.println("Url test, AfterClass");
	}

	@BeforeClass
	public void classStarts() {
    	System.out.println("Url test, BeforeClass");
	}
}
