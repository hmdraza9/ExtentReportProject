package SeleniumTestSuit.NewSeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class URLTest extends testBase
{
	
	@BeforeTest
	public void browserConfig() throws InterruptedException {
		BrowserInitSetup();
	}
	
	@AfterTest
	public void browserRelease() {
		BrowserQuit();
	}

	@Test
	public void google() {
		openGoogle();
	}
	
	@Test
	public void inCom() {
		openInDotCom();
	}
	
	@Test
	public void Yahoo() {
		openYahoo();
	}
	
	@Test
	public void ToolsQA() {
		openToolsQA();
	}
	
	@Test
	public void guru99() {
		openGuru99demo();
	}
	
	@Test
    public void methodHellowWord()
    {
        System.out.println( "Hello World!" );
    }

	@AfterClass
	public void classEnds() {
		AfterClassMethod();
	}

	@BeforeClass
	public void classStarts() {
		beforeClassMethod();
	}
}
