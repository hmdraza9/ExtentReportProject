package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import util.ScreenshotTaker;

public class titleValidationTest extends testBase
{

	private ExtentTest logger;
	private ScreenshotTaker st = new ScreenshotTaker();
	titleValidationTest(ExtentTest logger){
		this.logger = logger;
	}
	
	@Test
	public void IntitleValidationTest() {
				System.out.println("In titleValidationTest");
	}


	@BeforeTest
	public void browserConfig() throws InterruptedException, IOException{
		BrowserInitSetup();
	}
	
	@AfterTest
	public void browserRelease() {
		BrowserQuit();
		System.out.println("here I am!");
	}

//	@AfterMethod
//	public void AfterMeth(ITestResult result) {
//		System.out.println("I'm here!");
//		if(result.getStatus() == ITestResult.FAILURE) {
//			logger.log(LogStatus.FAIL, "Test Case: "+result.getName()+" failed!");
//			logger.log(LogStatus.FAIL, "Test Case failed is: "+result.getThrowable());
//			String ScreenshotFullPath = st.SnapperName(driver, result.getName());
//			logger.log(LogStatus.FAIL, logger.addScreenCapture(ScreenshotFullPath));
//			result.setAttribute("screenshotPath", ScreenshotFullPath);
//		}
//		if(result.getStatus() == ITestResult.SUCCESS) {
//			logger.log(LogStatus.PASS, "Test Case: "+result.getName()+" Passed!");
//			logger.log(LogStatus.PASS, "Test Case Passed is: "+result.getThrowable());
//			String ScreenshotFullPath = st.SnapperName(driver, result.getName());
//			logger.log(LogStatus.PASS, logger.addScreenCapture(ScreenshotFullPath));
//			result.setAttribute("screenshotPath", ScreenshotFullPath);
//		}
//	}

	@AfterClass
	public void AfterClass() {
		System.out.println("titleValidationTest, after class");
	}


	@BeforeClass
	public void b4Class() {
		System.out.println("titleValidationTest, before class");
	}
}
