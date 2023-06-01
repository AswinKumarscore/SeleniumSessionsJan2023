package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void search(String searchKey, By searchLocator) throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		By searchLocatora = By.id("APjFqb"); // NOTWORKING
		// *[@id="APjFqb"]
		By namelocator = By.name("q"); // working
		By xpath = By.xpath("*[@id=\"APjFqb\"]"); // NOTWORKING
		// xpath://*[@id="APjFqb"]
		// cssselector:#APjFqb

		By searchLocatorb = By.cssSelector("//*[@id=\"APjFqb\"]"); // NOTWORKING
		// *[@id="APjFqb"]
		search("Selenium",namelocator);

	}

}
