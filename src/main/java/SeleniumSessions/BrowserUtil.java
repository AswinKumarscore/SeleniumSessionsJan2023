package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;

	// wrapper method
	/*
	 * This method is initialize the driver on the basis of the given browser
	 * Possible browsers are chrome,firefox,safari,edge
	 * 
	 * @param browserName:
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Launching the browser:" + browserName);

		if (browserName == null) {
			System.out.println("Browser Name cannot be null");
			throw new MySeleniumException("BROWSER NAME BLANK/NULL EXCEPTION");

		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":

			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right Browser Name" + browserName);
			throw new MySeleniumException("WRONG BROWSER EXCEPTION");
		// break;
		}
		return driver;
	}

	/*
	 * @param URL
	 */
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("URL BLANK EXCEPTION");

		}
		if (url.contains("https"))// "https://www.amazon.com"
		{
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");
		}

	}

	//
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
