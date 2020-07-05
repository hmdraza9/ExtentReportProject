package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;

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
	public void browserConfig() throws InterruptedException, IOException {
		BrowserInitSetup();
	}
	
	@AfterTest
	public void browserRelease() {
		BrowserQuit();
	}

	@Test
	public void google() throws IOException {
		openGoogle();
	}
	
	@Test
	public void inCom() throws IOException {
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
	public void guru99() throws IOException {
		openGuru99demo();
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
