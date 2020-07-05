package SeleniumTestSuit.NewSeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class testBase 
{
	
	public static WebDriver driver;
	public static ChromeOptions co;
	public static PropertyReaderClass pr;
	public static ScreenshotTaker sc;
	
    public static void BrowserInitSetup() throws InterruptedException, IOException {
    	co = new ChromeOptions();
//    	co.addArguments("--headless");
    	System.out.println("Url test, Before Test, Browser initialization");
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul Hamid Raza/Documents/all-drivers/chromedriver.exe");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
//		driver.get("http://www.demo.guru99.com/v4/");
    	Thread.sleep(2000);
    }

    public void BrowserQuit() {
    	System.out.println("Url test, After Test, Browser closing");
    	driver.quit();
    }
    


    public static void openGoogle() throws IOException {
		driver.get("https://www.google.co.in/");
    	System.out.println(driver.getTitle());
    	System.out.println("Element found: "+driver.findElements(By.name("q")).size());
    	sc.Snapper(driver);
    }

    public static void openYahoo() throws IOException {
		driver.get("https://in.yahoo.com/?p=us");
    	System.out.println(driver.getTitle());
    	System.out.println("Element found: "+driver.findElements(By.name("p")).size());
    	sc.Snapper(driver);
    }

    public static void openInDotCom() throws IOException {
		driver.get("https://www.news18.com/entertainment/");
    	System.out.println(driver.getTitle());
    	System.out.println("Element found: "+driver.findElements(By.name("viewport")).size());
    	sc.Snapper(driver);
    }

    public static void openToolsQA() throws IOException {
		driver.get("https://www.toolsqa.com/");
    	System.out.println(driver.getTitle());
    	System.out.println("Element found: "+driver.findElements(By.name("theme-color")).size());
    	sc.Snapper(driver);
    }

    public static void openGuru99demo() throws IOException {
		driver.get("http://www.demo.guru99.com/v4/");
    	System.out.println(driver.getTitle());
    	System.out.println("Element found: "+driver.findElements(By.name("uid")).size());
    	sc.Snapper(driver);
    }
	

    public void AfterClassMethod() {
    	System.out.println("Url test, AfterClass");
    }

    public void beforeClassMethod() {
    	System.out.println("Url test, BeforeClass");
    }
}