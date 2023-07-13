package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
 class URLTest extends testBase
{
	
	@BeforeTest
	public void browserConfig() throws InterruptedException, IOException {
		BrowserInitSetup();
	}

	@Test
	public void InURLTest() {
				System.out.println("In URLTest");
	}
	
	@Test
	public void Google() throws IOException {
		openGoogle();
		st.Snapper(getDriver());
	}
	
	@Test
	public void InCom() throws IOException {
		openInDotCom();
		st.Snapper(getDriver());
	}

	@Test
	public void Yahoo() throws IOException {
		openYahoo();
		st.Snapper(getDriver());
	}
	
	@Test
	public void ToolsQA() throws IOException {
		openToolsQA();
		st.Snapper(getDriver());
	}
	
	@Test
	public void Guru99() throws IOException {
		openGuru99demo();
		st.Snapper(getDriver());
	}
}
