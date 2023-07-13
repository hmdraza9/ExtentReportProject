package extentReportListener;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import SeleniumTestSuit.NewSeleniumTest.testBase;
import util.ScreenshotTaker;

public class ExtentReporterNG implements IReporter {

	private ExtentReports extent;
	ScreenshotTaker st;
	testBase tb = new testBase();
	private static String ExtRepoDir;

	@BeforeMethod
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		st = new ScreenshotTaker();
		ExtentReporterNG.ExtRepoDir = outputDirectory + File.separator + "ExtentReportsTestNG.html";
		extent = new ExtentReports(ExtentReporterNG.ExtRepoDir, true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
	}

	@AfterMethod
	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase() + "ed");
				}
				if (result.getStatus() == ITestResult.SUCCESS || result.getStatus() == ITestResult.FAILURE
						|| result.getStatus() == ITestResult.SKIP) {

					String screenshotPath = st.SnapperName(tb.getDriver(), result.getName());
					test.addScreenCapture(screenshotPath);
				}
				
				test.addScreenCapture(st.SnapperName(tb.getDriver(), result.getName()));
				
				//don't delete below step
				extent.endTest(test);
			}
		}

	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}

}
