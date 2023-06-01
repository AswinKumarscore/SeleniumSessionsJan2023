package SeleniumWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		// TODO Auto-generated method stub
		By footer = By.xpath("//footer//ul/li/a");
		List<WebElement> eleList = waitForElementsVisible(footer, 0);
		System.out.println("elelist size is " + eleList.size());

		// footer//ul/li/a
	}
	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 * An expectation for checking that all elements present on the web page that match the 
	 * locatorare visible. Visibility means that the elements are not only displayed but also 
	 * have a heightand width that is greater than 0.
	 */

	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
	/**
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 * 
	 * An expectation for checking that there is at least one element present on a web page.
	 */
	
	public static  List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		//return List<WebElement> 
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * 
	 * @param locator
	 * @param timeOut
	 */
	
	public static void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.elementToBeClickable(locator)).click();;

	}
	

}
