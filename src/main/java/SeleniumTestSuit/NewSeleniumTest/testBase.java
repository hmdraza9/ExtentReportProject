package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import util.PropertyReaderClass;
import util.ScreenshotTaker;

/**
 * Hello world!
 *
 */
public class testBase {

	private static WebDriver driver;
	public static ChromeOptions co;
	public static PropertyReaderClass pr = new PropertyReaderClass();
	public static ScreenshotTaker st = new ScreenshotTaker();

	public static void BrowserInitSetup() throws InterruptedException, IOException {

		co = new ChromeOptions();
		co.addArguments("--headless");
		System.out.println("Url test, Before Test, Browser initialization");
		System.setProperty("webdriver.chrome.driver", "C:/all-driver/chromedriver.exe");
		driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(pr.propReader("urlGuru99"));
//		st.Snapper(driver, true);
	}
	
	public WebDriver getDriver() {
		
		return driver;
		
	}

	public void BrowserQuit() {
		System.out.println("Url test, After Test, Browser closing");
		driver.quit();
	}

	public static void openGoogle() throws IOException {
		driver.get(pr.propReader("urlGoogle"));
		System.out.println(driver.getTitle());
//		st.Snapper(driver, true);
		
//		System.out.println("Element found: " + driver.findElements(By.name("q")).size());

	}

	public static void openYahoo() throws IOException {
		driver.get(pr.propReader("urlYahoo"));
		System.out.println(driver.getTitle());
//		Assert.assertTrue(driver.getTitle().contains("2as"));
//		st.Snapper(driver, true);
//		System.out.println("Element found: " + driver.findElements(By.name("p")).size());

	}

	public static void openInDotCom() throws IOException {
		driver.get(pr.propReader("urlNews18"));
		System.out.println(driver.getTitle());
//		st.Snapper(driver, true);
//		System.out.println("Element found: " + driver.findElements(By.name("viewport")).size());

	}

	public static void openToolsQA() throws IOException {
		driver.get(pr.propReader("urlToolsQA"));
		System.out.println(driver.getTitle());
//		st.Snapper(driver, true);
//		System.out.println("Element found: " + driver.findElements(By.xpath("//img[contains(@class,'header__logo')]")).size());

	}

	public static void openGuru99demo() throws IOException {
		driver.get(pr.propReader("urlGuru99"));
		System.out.println(driver.getTitle());
//		st.Snapper(driver, true);
//		System.out.println("Element found: " + driver.findElements(By.name("uid")).size());

	}

}